package yourPet.Test;

import Clases.*;
import Controller.ctlPayments;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class paymentsTest {
    clsPaymentsPet paymentPet_1;
    clsPaymentsPet paymentPet_2;
    clsPayments payment;
    clsPlans plan;
    clsPetOwner pet;
    ctlPayments controlPayment;
    
    public paymentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        plan = Mockito.mock(clsPlans.class);
        pet = Mockito.mock(clsPetOwner.class);
        payment = Mockito.mock(clsPayments.class);
        paymentPet_1 = new clsPaymentsPet(0, payment.getPaymentMethod(), 6, payment.getIdPaymentMethod(), payment.getDate(), plan.getIdPlan(), pet.getIdPet());
        paymentPet_2 = new clsPaymentsPet(0, "Credit / debit card", 2, "001-011-111-01", "2021-08-13", 1, 1);
    }
    
    @After
    public void tearDown() {
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void obtainPaymentPet(){
        System.out.println("TEST 1: Obtain a Payment:");
        
        //Prepare:
        String valueWaited = "Fees: 2 - ID plan: 1 - Code pet: 1";
        
        //Acting:
        String valueObtained = "Fees: " + paymentPet_2.getFees()+ " - ID plan: " + paymentPet_2.getIdPlan()+ " - Code pet: " + paymentPet_2.getIdPet();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void createPaymentPet(){
        System.out.println("TEST 2: Simulation of payment creation:");
        
        //Prepare:
        Mockito.when(plan.getIdPlan()).thenReturn(1);
        Mockito.when(pet.getIdPet()).thenReturn(2);
        Mockito.when(payment.getPaymentMethod()).thenReturn("Bank transfer");
        Mockito.when(payment.getIdPaymentMethod()).thenReturn("001-011-111-02");
        Mockito.when(payment.getDate()).thenReturn("2021-08-13");
        String valueWaited = "Number of fees: 6 - Payment method: Bank transfer - ID payment method: 001-011-111-02 - Date: 2021-08-13 - ID plan: 1 - ID pet: 2";
        
        //Acting:        
        String valueObtained = "Number of fees: " + paymentPet_1.getFees()+ " - Payment method: " + payment.getPaymentMethod()+ " - ID payment method: " 
                             + payment.getIdPaymentMethod()+ " - Date: " + payment.getDate()+ " - ID plan: " + plan.getIdPlan()+ " - ID pet: " 
                             + pet.getIdPet();
        System.out.println(valueObtained);
        
        //Affirmations:
        assertEquals(valueWaited, valueObtained);
    }
    
    //--------------------------------------------------------------------------
}
