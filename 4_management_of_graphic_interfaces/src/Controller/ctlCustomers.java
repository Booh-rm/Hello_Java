package Controller;

import Class.clsCustomers;
import Model.modelCustomer;

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
    
    public void updateCustomer(String id, clsCustomers customer){
        
        modelCustomer.updateCustomer(id, (clsCustomers) customer);    
    }
    
    //--------------------------------------------------------------------------
    
    public void deleteCustomer(String id, clsCustomers customer){
        modelCustomer.deleteCustomer((clsCustomers) customer);
    }
    
    //--------------------------------------------------------------------------
}
