package Controller;

import Clases.clsPlans;
import Model.modelPlans;
import java.util.LinkedList;


public class ctlPlans {
    
    modelPlans modelPlan;

    //--------------------------------------------------------------------------
    
    public ctlPlans() {
        modelPlan = new modelPlans();
    }
    
    //--------------------------------------------------------------------------
     public clsPlans readPlan( String name){

        return modelPlan.readPlan(name);
    }
     
    //--------------------------------------------------------------------------
    
    public LinkedList<clsPlans> plansList(){
        return modelPlan.plansList();
    }
    
    //--------------------------------------------------------------------------
}
