package Controller;

import Class.clsPets;
import Model.modelPet;

public class ctlPets {
    
    modelPet modelPet;
    
    //--------------------------------------------------------------------------

    public ctlPets() {
    
        modelPet = new modelPet();
    }
    
    //--------------------------------------------------------------------------
    
    public void createPet(clsPets pet){
        
        modelPet.createPet((clsPets) pet);
    }
    
    //--------------------------------------------------------------------------
    
    public clsPets readPet(String code){
    
        return modelPet.readPet(code);
    }
    
    //--------------------------------------------------------------------------
    
    public void updatePet (String code, clsPets pet){
    
        modelPet.updatePet(code, (clsPets) pet);
    }
    
    //--------------------------------------------------------------------------
    
    public void deletePet(String code, clsPets pet){
        
        modelPet.deletePet((clsPets)pet);
    }
    
    //--------------------------------------------------------------------------
}
