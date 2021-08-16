package Model;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class modelPet {

    DBdata DBdata;
    
    public modelPet() {
        DBdata = new DBdata();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createPet(clsPets pet, clsCustomers owner, clsPlans plan){
        if (pet.getAge()<= 0 || pet.getWeight()<= 0) {
            throw new ArithmeticException("Neither the \"Age\" nor the \"Weight\" can be less than or equal to zero.");
        }
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())){
            String query = "INSERT INTO `tb_pets`(`code_pet`,`name`, `age`, `weight`, `species`, `id_owner_pet`, `id_plan`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setString(1, pet.getCode());
            preparedStatement.setString(2, pet.getName());
            preparedStatement.setInt(3, pet.getAge());
            preparedStatement.setDouble(4, pet.getWeight());
            preparedStatement.setString(5, pet.getSpecies());
            preparedStatement.setInt(6, owner.getIdCustomer());
            preparedStatement.setInt(7, plan.getIdPlan());
            
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Pet registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updatePet(clsPets pet, clsCustomers owner, clsPlans plan) {
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "UPDATE `tb_pets` SET `code_pet`= ?, `name`= ?, `age`= ?, `weight`= ?, `id_owner_pet` = ?, `id_plan`= ? WHERE `id`= ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
             
            preparedStatement.setString(1, pet.getCode());
            preparedStatement.setString(2, pet.getName());
            preparedStatement.setInt(3, pet.getAge());
            preparedStatement.setDouble(4, pet.getWeight());
            preparedStatement.setInt(5, owner.getIdCustomer());
            preparedStatement.setInt(6, plan.getIdPlan());
            preparedStatement.setInt(7, pet.getIdPet());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deletePet(clsPets pet) {
        try(Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "DELETE FROM `tb_pets` WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, pet.getIdPet());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsPets readPet(String code){
            try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query ="SELECT `id`, `code_pet`,`name`, `age`, `weight`, `species` FROM `tb_pets` WHERE code_pet = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, code);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsPets pet_obtained = new clsPets(
                rs.getInt("id"),
                rs.getString("code_pet"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getDouble("weight"),
                rs.getString("species"));
                return pet_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPets> petsList(){
        LinkedList<clsPets> pets = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `code_pet`,`name`, `age`, `weight`, `species` FROM `tb_pets`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsPets pet_obtained = new clsPets(
                rs.getInt("id"),
                rs.getString("code_pet"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getDouble("weight"),
                rs.getString("species"));
                
                pets.add(pet_obtained);
            }
            return pets;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
       public clsPetOwner readPetOwner(String code){
            try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query ="SELECT `id`, `code_pet`,`name`, `age`, `weight`, `species`, `id_owner_pet`, `id_plan` FROM `tb_pets` WHERE code_pet = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, code);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsPetOwner pet_obtained = new clsPetOwner(
                rs.getInt("id"),
                rs.getString("code_pet"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getDouble("weight"),
                rs.getString("species"),
                rs.getInt("id_owner_pet"),
                rs.getInt("id_plan"));
                
                return pet_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------   
       
    public LinkedList<clsPetOwner> petsListOwner(){
        LinkedList<clsPetOwner> petsO = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `code_pet`,`name`, `age`, `weight`, `species`, `id_owner_pet`, `id_plan` FROM `tb_pets` ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsPetOwner pet_obtained = new clsPetOwner(
                rs.getInt("id"),
                rs.getString("code_pet"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getDouble("weight"),
                rs.getString("species"),
                rs.getInt("id_owner_pet"),
                rs.getInt("id_plan"));        
                
                petsO.add(pet_obtained);
            }
            return petsO;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    public LinkedList<clsChartPetsSpecies> ChartOfPetsSpecies(){
        
        LinkedList<clsChartPetsSpecies> petsSpecies = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT species, COUNT(*) AS amount FROM `tb_pets` GROUP BY species;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsChartPetsSpecies petSpecies = new clsChartPetsSpecies("Pet species: " + rs.getString("species"), rs.getInt("amount"));
                
                petsSpecies.add(petSpecies);
            }
            return petsSpecies;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------

}
