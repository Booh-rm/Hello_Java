package yourPet.Test;

import Clases.clsCustomers;
import Clases.clsPets;
import Clases.clsPlans;
import Controller.ctlCustomers;
import Controller.ctlPets;
import Controller.ctlPlans;
import Model.modelPet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class modelPetTest {
    
    clsPets pet;
    ctlCustomers controlCustomer = new ctlCustomers();
    ctlPets controlPet = new ctlPets();
    ctlPlans controlPlans = new ctlPlans();
    modelPet ModelPet = new modelPet();
    
    public modelPetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pet = new clsPets(0, "0012", "pet 12", 12, 12.0, "Feline");
    }
    
    @After
    public void tearDown() {
    }
    
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    
    @Test
    public void createPet(){
        System.out.println('\n' + "TEST 1: Create pet (to Database)");
        
        //Prepare:
        clsPlans planSearch = controlPlans.readPlan("Diamond plan");
        clsCustomers customerSearch = controlCustomer.readCustomer("01234567891");
        controlPet.createPet(pet, customerSearch, planSearch);
        String valueWaited = "Name: pet 12 - Age: 12 - Plan: Diamond plan - Species: Feline";
        
        //Acting:
        String valueObtained = "Name: " + pet.getName()+  " - Age: " + pet.getAge()+ " - Plan: " + planSearch.getNamePlan()+ " - Species: "+ pet.getSpecies();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void readPet(){
        System.out.println('\n' + "TEST 2: Read all data of a pet (from the Database):");
        
        //Prepare:
        clsPets petSearch =  controlPet.readPet("007");
        String valueWaited = "Code: 007 - Name: pet 7 - Age: 7 - Weight: 7.0 - Species: Canine";
        
        //Acting:
        String valueObtained = "Code: " +  petSearch.getCode()+ " - Name: " + petSearch.getName()+ " - Age: " + petSearch.getAge() +" - Weight: " +  
                               petSearch.getWeight()+ " - Species: " + petSearch.getSpecies();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void updatePet(){
        System.out.println('\n' + "TEST 3: modify a pet (from the database):");
        
        //Prepare:
        clsPlans planSearch = controlPlans.readPlan("Diamond plan");
        clsCustomers customerSearch = controlCustomer.readCustomer("01234567891");
        clsPets pet_to_modify = new clsPets(9, "009", "pet 9 II", 9, 9, "Canine");
        controlPet.updatePet(pet_to_modify, customerSearch, planSearch);
        
        //Acting:
        boolean valueObtained = ModelPet.updatePet(pet, customerSearch, planSearch);
        System.out.println(valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void deletePet(){
        System.out.println('\n' + "TEST 4: Delete a pet (from the Database):");
        
        //Prepare:
        clsPets pet_a_remove = new clsPets(10, "0010", "pet 10", 10, 10, "Feline");
        controlPet.delelePet(pet_a_remove);
        
        //Acting:
        boolean valueObtained = ModelPet.deletePet(pet);
        System.out.println(valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test(expected = ArithmeticException.class)
    public void createPetControllerArithmeticException(){
        System.out.println('\n' + "TEST 5: Create pet from database - ArithmeticException");
        
        //Prepare:
        clsPlans planSearch = controlPlans.readPlan("Diamond plan");
        clsCustomers customerSearch = controlCustomer.readCustomer("012345678911");
        clsPets pet1 = new clsPets(0, "0011", "pet 11", -2, 4.5, "Canine");
        
        //Acting:
        boolean valueObtained = ModelPet.createPet(pet1, customerSearch, planSearch);
        System.out.println(valueObtained);
    }
    
    //--------------------------------------------------------------------------
}
