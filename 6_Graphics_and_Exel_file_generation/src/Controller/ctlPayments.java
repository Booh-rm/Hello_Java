package Controller;

import Clases.*;
import Model.modelPayment;
import java.util.LinkedList;

public class ctlPayments {
    
    modelPayment modelPayment;

    public ctlPayments() {
        modelPayment = new modelPayment();
    }
    
    //--------------------------------------------------------------------------
    
    public void createPayment(clsPayments Payment, clsPetOwner pet, clsPlans plan){
        
        modelPayment.createPayment((clsPayments) Payment, (clsPetOwner) pet, (clsPlans) plan); 
  
    }
    
    //--------------------------------------------------------------------------
    
    public clsPayments readPayment(int id_pet){
        
        return modelPayment.readPayment(id_pet);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updatePayment (clsPayments Payment, clsPetOwner pet, clsPlans plan){
        
            return modelPayment.updatePayment((clsPayments) Payment, (clsPetOwner) pet, (clsPlans) plan);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deletePayment(clsPayments Payment){
        
            return modelPayment.deletePayment((clsPayments) Payment);
        
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPayments> paymentslist(){
        return modelPayment.paymentsList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPaymentsPet> paymentListOwner(){
        return modelPayment.paymentsListOwner();
    }
    
    //--------------------------------------------------------------------------
}
