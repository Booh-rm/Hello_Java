package Model;

import Class.clsPets;

public class modelPet {

    public modelPet() {
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createPet(clsPets pet){
        try{
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updatePet(String code, clsPets pet) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deletePet(clsPets pet) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsPets readPet(String code){
        try {
            return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
