package yourPet.Test;

import Clases.clsPlans;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class plansTest {
    
    clsPlans plans;
    
    public plansTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        plans = new clsPlans(0, "001", "Wellness plan", "Basic plan for the care of your pet", 100);
    }
    
    @After
    public void tearDown() {
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPlanCode(){
        System.out.println('\n' + "TEST 1: Obtain a plan code:");
        
        //Prepare:
        String valueWaited = "001";
        
        //Acting:
        String valueObtained = plans.getCodePlan();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPlanName(){
        System.out.println('\n' + "TEST 2: Obtain the name of a plan:");
        
        //Prepare:
        String valueWaited = "Wellness plan";
        
        //Acting:
        String valueObtained = plans.getNamePlan();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPlanDescription(){
        System.out.println('\n' + "TEST 3: Obtain a plan description:");
        
        //Prepare:
        String valueWaited = "Basic plan for the care of your pet";
        
        //Acting:
        String valueObtained = plans.getDescription();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPlanPrice(){
        System.out.println('\n' + "TEST 4: Obtain the price of a plan:");
        
        //Prepare:
        String valueWaited = "100 USD";
        
        //Acting:
        String valueObtained = plans.getPrice()+ " USD"; 
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPlanTotalData(){
        System.out.println('\n' + "TEST 5: Obtain all the data of a plan:");
        
        //Prepare:
        String valueWaited = "Code: 001 - Name: Wellness plan - Description: Basic plan for the care of your pet - Price: 100 USD";
        
        //Acting:
        String valueObtained = "Code: " + plans.getCodePlan()+ " - Name: " + plans.getNamePlan()+ " - Description: " + plans.getDescription() + " - Price: " + plans.getPrice()+ " USD";
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
}
