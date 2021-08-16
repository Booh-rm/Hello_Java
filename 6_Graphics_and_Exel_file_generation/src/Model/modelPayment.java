package Model;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class modelPayment {

    DBdata DBdata;
    
    public modelPayment() {
        DBdata = new DBdata();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createPayment(clsPayments Payment, clsPetOwner pet, clsPlans plan) {
        
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())){

            String query = "INSERT INTO `tb_monthly_fees`(`fees`, `payment_method`, `payment_method_id`, `date_fees`, `id_plan`, `id_pet`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setInt(1, Payment.getFees());
            preparedStatement.setString(2, Payment.getPaymentMethod());
            preparedStatement.setString(3, Payment.getIdPaymentMethod());
            preparedStatement.setString(4, Payment.getDate());
            preparedStatement.setInt(5, plan.getIdPlan());
            preparedStatement.setInt(6, pet.getIdPet());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Payment registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updatePayment(clsPayments Payment, clsPetOwner pet, clsPlans plan) {
        
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {

            String query = "UPDATE `tb_monthly_fees` SET `fees`= ?, `payment_method`= ?, `payment_method_id`= ?, `date_fees`= ?, `id_plan`= ?, `id_pet`= ? WHERE `id`= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
             
            preparedStatement.setInt(1, Payment.getFees());
            preparedStatement.setString(2, Payment.getPaymentMethod());
            preparedStatement.setString(3, Payment.getIdPaymentMethod());
            preparedStatement.setString(4, Payment.getDate());
            preparedStatement.setInt(5, plan.getIdPlan());
            preparedStatement.setInt(6, pet.getIdPet());
            preparedStatement.setInt(7, Payment.getIdPayment());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deletePayment(clsPayments Payments) {
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "DELETE FROM `tb_monthly_fees` WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Payments.getIdPayment());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsPayments readPayment(int idPet){
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
        String query = "SELECT `id`, `fees`, `payment_method`, `payment_method_id`, `date_fees` FROM `tb_monthly_fees` WHERE id_pet = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1, idPet);

        ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsPayments Payments_obtained = new clsPayments(
                rs.getInt("id"),
                rs.getString("payment_method"),
                rs.getInt("fees"),
                rs.getString("payment_method_id"),
                rs.getString("date_fees")); 
                return Payments_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsPaymentsPet readPaymentOwner(int idPet){
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
        String query = "SELECT `id`, `fees`, `payment_method`, `payment_method_id`, `date_fees`, `id_plan`, `id_pet` WHERE id_pet = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1, idPet);

        ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsPaymentsPet Payments_obtained = new clsPaymentsPet(
                rs.getInt("id"),
                rs.getString("payment_method"),
                rs.getInt("fees"),
                rs.getString("payment_method_id"),
                rs.getString("date_fees"), 
                rs.getInt("id_plan"), 
                rs.getInt("id_pet")); 
                return Payments_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPayments> paymentsList(){
        LinkedList<clsPayments> Payments = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `fees`, `payment_method`, `payment_method_id`, `date_fees` FROM `tb_monthly_fees`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsPayments Payments_obtained = new clsPayments(
                rs.getInt("id"),
                rs.getString("payment_method"),
                rs.getInt("fees"),
                rs.getString("payment_method_id"),
                rs.getString("date_fees"));        
                
                Payments.add(Payments_obtained);
            }
            return Payments;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPaymentsPet> paymentsListOwner(){
        LinkedList<clsPaymentsPet> PaymentsO = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `fees`, `payment_method`, `payment_method_id`, `date_fees`, `id_plan`, `id_pet` FROM `tb_monthly_fees`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsPaymentsPet Payments_obtained = new clsPaymentsPet(
                rs.getInt("id"),
                rs.getString("payment_method"),
                rs.getInt("fees"),
                rs.getString("payment_method_id"),
                rs.getString("date_fees"),
                rs.getInt("id_plan"),
                rs.getInt("id_pet"));
                
                PaymentsO.add(Payments_obtained);
            }
            return PaymentsO;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
