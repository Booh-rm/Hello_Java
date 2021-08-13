package Model;

import Clases.clsCustomers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class modelCustomer {

    DBdata DBdata;
    
    public modelCustomer() {
        DBdata = new DBdata();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createCustomer(clsCustomers customer){
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())){
            String query = "INSERT INTO `tb_customers`(`id_customer`, `name`, `last_name`, `address`, `phone`) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getLastName());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getPhone());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Customer registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateCustomer(clsCustomers customer) {
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "UPDATE `tb_customers` SET `id_customer`= ?, `name`= ?, `last_name`= ?, `address`= ?, `phone`= ? WHERE `id`= ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
             
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getLastName());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setInt(6, customer.getIdCustomer());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteCustomer(clsCustomers customer) {
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "DELETE FROM `tb_customers` WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customer.getIdCustomer());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsCustomers readCustomer(String id){
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query ="SELECT ctm.id AS IdCustomer, ctm.id_customer, ctm.name, ctm.last_name, ctm.address, ctm.phone FROM `tb_customers` AS ctm WHERE ctm.id_customer = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsCustomers customer_obtained = new clsCustomers(
                rs.getInt("IdCustomer"),
                rs.getString("id_customer"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("address"),
                rs.getString("phone"));
                return customer_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsCustomers> CustomersList(){
        LinkedList<clsCustomers> customers = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT ctm.id AS IdCustomer, ctm.id_customer, ctm.name, ctm.last_name, ctm.address, ctm.phone FROM `tb_customers` AS ctm";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsCustomers customer_obtained = new clsCustomers(
                rs.getInt("IdCustomer"),
                rs.getString("id_customer"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("address"),
                rs.getString("phone"));
                
                customers.add(customer_obtained);
            }
            return customers;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
