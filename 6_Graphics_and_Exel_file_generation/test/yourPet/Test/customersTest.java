package yourPet.Test;

import Clases.clsCustomers;
import Controller.ctlCustomers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class customersTest {
    
    clsCustomers customer;
    ctlCustomers controlCustomer;
    
    public customersTest() {
        controlCustomer = new ctlCustomers();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        customer = new clsCustomers(0, "01234567891", "Name customer", "Last name customer", "Address customer", "Phone customer");
    }
    
    @After
    public void tearDown() {
    }
    
    //--------------------------------------------------------------------------
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerID(){
        System.out.println('\n' + "TEST 1: Obtain customer ID number:");
        
        //Prepare:
        String valueWaited = "01234567891";
        
        //Acting:
        String valueObtained = customer.getId();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerName(){
        System.out.println('\n' + "TEST 2: Obtain customer name:");
        
        //Prepare:
        String valueWaited = "Name customer";
        
        //Acting:
        String valueObtained = customer.getName();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerLastName(){
        System.out.println('\n' + "TEST 3: Obtain customer's last name:");
        
        //Prepare:
        String valueWaited = "Last name customer";
        
        //Acting:
        String valueObtained = customer.getLastName();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerAddress(){
        System.out.println('\n' + "TEST 4: Obtain customer's home address:");
        
        //Prepare:
        String valueWaited = "Address customer"; 
        
        //Acting:
        String valueObtained = customer.getAddress();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerPhone(){
        System.out.println('\n' + "TEST 5: Obtain customer phone number:");
        
        //Prepare:
        String valueWaited = "Phone customer";
        
        //Acting:
        String valueObtained = customer.getPhone();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerTotalData(){
        System.out.println('\n' + "TEST 6: Obtain all customer data:");
        
        //Prepare:
        String valueWaited = "01234567891 - Name customer Last name customer - Address customer - Phone customer";
        
        //Acting:
        String valueObtained = customer.getId() + " - " + customer.getName()+ " " + customer.getLastName()+ " - " + customer.getAddress()+ " - " + customer.getPhone();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    //----------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void obtainCustomerController(){
        System.out.println('\n' + "TEST 7: Obtain customer name (from database):");
        
        //Prepare:
        clsCustomers customerSearched = controlCustomer.readCustomer("01234567891");
        String valueWaited = "Name customer 1";
        
        //Acting:
        String valueObtained = customerSearched.getName();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void obtainCustomerTotalDataController(){
        System.out.println('\n' + "TEST 8: Obtain all customer data (from the Database):");
        
        //Prepare:
        clsCustomers customerSearched = controlCustomer.readCustomer("01234567891");
        String valueWaited = "01234567891 - Name customer 1 last name customer 1 - address customer 1 - 0011234567890";
        
        //Acting:
        String valueObtained = customerSearched.getId() + " - " + customerSearched.getName()+ " " + customerSearched.getLastName()+ " - " + customerSearched.getAddress()+ " - " + customerSearched.getPhone();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------
}
