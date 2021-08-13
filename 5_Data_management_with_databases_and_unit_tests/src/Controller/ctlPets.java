package Controller;

import Clases.*;
import Model.modelPet;
import java.util.LinkedList;

public class ctlPets {
    
    modelPet modelPet;
    
    //--------------------------------------------------------------------------

    public ctlPets() {
    
        modelPet = new modelPet();
    }
    
    //--------------------------------------------------------------------------
    
    public void createPet(clsPets pet, clsCustomers owner, clsPlans plan){
        
            modelPet.createPet((clsPets) pet, (clsCustomers) owner, (clsPlans) plan);
        }
    
    //--------------------------------------------------------------------------
    
    public clsPets readPet(String code){
        
        return modelPet.readPet(code);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updatePet (clsPets pet, clsCustomers owner, clsPlans plan){
        
        return modelPet.updatePet((clsPets) pet, (clsCustomers) owner, (clsPlans) plan);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean delelePet(clsPets pet){
        
        return modelPet.deletePet((clsPets)pet);
    }
    
    //--------------------------------------------------------------------------
    
    
    public LinkedList<clsPets> petsList(){
        return modelPet.petsList();
    }
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    
    public LinkedList<clsPetOwner> petsListOwner(){
        return modelPet.petsListOwner();
    }
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
}
