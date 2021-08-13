package yourPet.Test;

import Clases.clsPets;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class petsTest {
    
    clsPets pet;

            
    public petsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pet = new clsPets(0, "001", "Name pet", 1, 2.5, "Feline");
    }
    
    @After
    public void tearDown() {
    }
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCodePet(){
        System.out.println('\n' + "TEST 1: Obtain the pet code:");
        
        //Prepare:
        String valueWaited = "001";
        
        //Acting:
        String valueObtained = pet.getCode();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainNamePet(){
        System.out.println('\n' + "TEST 2: Obtain the pet name:");
        
        //Prepare:
        String valueWaited = "Name pet";
        
        //Acting:
        String valueObtained = pet.getName();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainAgePet(){
        System.out.println('\n' + "TEST 3: Obtain pet age:");
        
        //Prepare:
        int valueWaited = 1;
        
        //Acting:
        int valueObtained = pet.getAge();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainWeightPet(){
        System.out.println('\n' + "TEST 4: Obtain the weight of the pet:");
        
        //Prepare:
        double valueWaited = 2.5;
        
        //Acting:
        double valueObtained = pet.getWeight();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained, 0.1) ;
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainSpeciesPet(){
        System.out.println('\n' + "TEST 5: Obtain the species of the pet:");
        
        //Prepare:
        String valueWaited = "Feline";
        
        //Acting:
        String valueObtained = pet.getSpecies();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainTotalDataPet(){
        System.out.println('\n' + "TEST 6: Obtain all pet data:");
        
        //Prepare:
        String valueWaited = "Code: 001 - Name: Name pet - Age: 1 - Weight: 2.5 - Species: Feline";
        
        //Acting:
        String valueObtained ="Code: " +  pet.getCode()+ " - Name: " + pet.getName()+ " - Age: " + pet.getAge()+" - Weight: " +  pet.getWeight()+ " - Species: " + pet.getSpecies();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    } 

    //--------------------------------------------------------------------------
}
