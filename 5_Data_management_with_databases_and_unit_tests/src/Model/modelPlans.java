package Model;

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
        try (Connection conexion = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query ="SELECT `id`, `code_plan`, `name`, `description`, `price` FROM `tb_plans` AS pln WHERE pln.name = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            
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
        
        
        try (Connection conexion = DriverManager.getConnection(DBdata.getUrl(), DBdata.getUser(), DBdata.getPass())) {
            String query = "SELECT `id`, `code_plan`, `name`, `description`, `price` FROM `tb_plans`";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
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
}
