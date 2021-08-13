package Controller;

import Clases.clsCustomers;
import Model.modelCustomer;
import java.util.LinkedList;

public class ctlCustomers {
    
    modelCustomer modelCustomer;

    //--------------------------------------------------------------------------
    
    public ctlCustomers() {
        
        modelCustomer = new modelCustomer();
    }
    
    //--------------------------------------------------------------------------
    
    public void createCustomer(clsCustomers customer){
        
        modelCustomer.createCustomer((clsCustomers) customer);
    }
    
    //--------------------------------------------------------------------------
    
    public clsCustomers readCustomer(String id){
        
        return modelCustomer.readCustomer(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateCustomer(clsCustomers customer){
        
        return modelCustomer.updateCustomer((clsCustomers) customer);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteCustomer(clsCustomers customer){
        
        return modelCustomer.deleteCustomer((clsCustomers) customer);
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsCustomers> customersList(){
        return modelCustomer.CustomersList();
    }
    
    //--------------------------------------------------------------------------
}
