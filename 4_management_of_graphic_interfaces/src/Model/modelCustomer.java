package Model;

import Class.clsCustomers;

public class modelCustomer {

    public modelCustomer() {
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createCustomer(clsCustomers customer){
        try{
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateCustomer(String id, clsCustomers customer) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteCustomer(clsCustomers customer) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsCustomers readCustomer(String id){
        try {
            return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
