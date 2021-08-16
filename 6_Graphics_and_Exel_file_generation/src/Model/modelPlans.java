package Model;

import Clases.clsChartPetsPlan;
import Clases.clsPlans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class modelPlans {

    DBdata DBdata;
    
    public modelPlans() {
         DBdata = new DBdata();
    }
    
    //--------------------------------------------------------------------------
    
    public clsPlans readPlan(String name){
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query ="SELECT `id`, `code_plan`, `name`, `description`, `price` FROM `tb_plans` AS pln WHERE pln.name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, name);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsPlans plan_obtained = new clsPlans(
                rs.getInt("id"),
                rs.getString("code_plan"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("price"));
                
                return plan_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPlans> plansList(){
        LinkedList<clsPlans> plans = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `code_plan`, `name`, `description`, `price` FROM `tb_plans`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsPlans plan_obtained = new clsPlans(
                rs.getInt("id"),
                rs.getString("code_plan"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("price"));
                
                plans.add(plan_obtained);
            }
            return plans;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsChartPetsPlan> ChartPetsPlan(){
        
        LinkedList<clsChartPetsPlan> petsPlan = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT tb_plans.name, COUNT(*) AS amount FROM tb_plans INNER JOIN tb_pets ON tb_pets.id_plan = tb_plans.id GROUP BY tb_plans.name;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsChartPetsPlan petPlan = new clsChartPetsPlan(rs.getString("name"), rs.getInt("amount"));        
                petsPlan.add(petPlan);
            }
        return petsPlan;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
