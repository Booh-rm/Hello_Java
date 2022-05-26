
package pharmacy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Booh
 */
public class Pharmacy {
    
    //------------------------------------------------------------------------------------------------------------------
    
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static String capitalize(String str) {
        
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
        
    }
    
    //------------------------------------------------------------------------------------------------------------------

    
    public static void main(String[] args) {
        
        String informacion  =
        "------------------------------------------------------------------------------------\n" +
        "|                                                                                  |\n" +
        "|                                      Dr. Dolittle:                               |\n" +
        "|                                     P H A R M A C Y                              |\n" +
        "|                                                                                  |\n" +
        "------------------------------------------------------------------------------------";
        
        System.out.println(informacion);
        
        //-----------------------------------------------------------------------
        
        clsArchive a = new clsArchive();
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
    //---------------------------------------------------------------------------
        
        while (!exit) {
            System.out.println("----------------------------------------------------------------------" + '\n');
            System.out.println(ANSI_GREEN + "*☺****WELCOME****☺*" + ANSI_RESET + '\n');
            System.out.println("1. Create prescription");
            System.out.println("2. Print prescription");
            System.out.println("0. Exit");
 
            try {
                System.out.println('\n' + "Write one of the options:");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        new_prescription();
                        break;
                    case 2:
                        print_prescription();
                        break;
                    case 0:
                        a.deleteP();
                        a.deleteT();
                        a.deleteI();
                        a.deleteL();
                    System.err.println((char)27 + "[35;1m\n☻ HAS LEFT THE PROGRAMME ☻\n");
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1,2 y 0~~~" + '\n' + ANSI_RESET);
                }
            } 
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST INSERT A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }

    //---------------------------------------------------------------------------
    
    private static void new_prescription() {
        
        clsArchive a = new clsArchive();
        
        Scanner sn = new Scanner (System.in);
       
        System.out.println("Patient Name: ");
        String PatientName = sn.nextLine();
        
        a.deleteP();
        a.deleteT();
        a.deleteI();
        a.deleteL();
        
        clsPatient patient = new clsPatient(PatientName);
        
        a.writePatient(patient);
        
        boolean exit = false;
        int  value = 0;

        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            
            System.out.println("Medicines: \n");
            System.out.println("[T]ablet [L]iquid [I]njection e[X]it: ");
            String  options = sn.nextLine();
            String response = capitalize(options);
            
            switch (response) {
                case "T":
                    value=1;
                    break;
                case "L":
                    value=2;
                    break;
                case "I":
                    value=3;
                    break;
                case "X":
                    value=4;
                    break;
                default:
                    System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY LETTERS T, L,I o X~~~" + '\n' + ANSI_RESET);
            }

            try {
                switch (value) {
                    case 1:
                        tablet();                    
                        break;
                    case 2:
                        liquid();
                        break;
                    case 3:
                        injection();
                        break;
                    case 4:
                         exit = true;
                         break;      
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY LETTERS T, L,I o X~~~" + '\n' + ANSI_RESET);
                           
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST INSERT A LETTER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }

    //--------------------------------------------------------------------------
    
    private static void tablet() {
        
        clsArchive a = new clsArchive();

        Scanner sn = new Scanner (System.in);
        
        System.out.println("Medicine Name: ");
        String MedicineName = sn.nextLine();
        System.out.println("Weight (Mg): ");
        String Weight = sn.nextLine();
        System.out.println("Amount of tables: ");
        String Amountoftables = sn.nextLine();
        System.out.println("Dosage: ");
        String Dosage = sn.nextLine();  
        
        clsTablet tablet = new clsTablet(MedicineName, Weight, Amountoftables, Dosage);
        
        a.writeTablet(tablet);
    }
    
    //--------------------------------------------------------------------------
    
    private static void liquid() {

        clsArchive a = new clsArchive();
        
        Scanner sn = new Scanner (System.in);
        
        String Suspentions = "(Suspention)";
        String Suspentionn = "";
        
        System.out.println("Medicine Name: ");
        String MedicineName = sn.nextLine();
        System.out.println("Is Suspention?: (Y/N)");
        String Suspention = sn.nextLine();
        
        String sus = capitalize(Suspention);
        
        if (sus.equals("Y")){
            sus = Suspentions;
        }
        else if (sus.equals("N")){
            sus = Suspentionn;
        }
        
        System.out.println("Amount (Ml): ");
        String Amount = sn.nextLine();
        System.out.println("Dosage: ");
        String Dosage = sn.nextLine();
        
        
        clsLiquid liquid = new clsLiquid(MedicineName, sus, Amount, Dosage);
        
        a.writeLiquid(liquid);
    }
    
    //--------------------------------------------------------------------------
    
    private static void injection() {

        clsArchive a = new clsArchive();
        
        Scanner sn = new Scanner (System.in);
        
        String type0= "(Intravenous)";
        String type1= "(Intramuscular)";
        
        System.out.println("Medicine Name: ");
        String MedicineName = sn.nextLine();
        System.out.println("Type (0:Intravenous 1:Intramuscular): ");
        String Type = sn.nextLine();
        
        String typ = Type;
        
        if (typ.equals("0")){
            typ = type0;
        }
        else if (typ.equals("1")) {
            typ = type1;
        }
        
        System.out.println("Amount of vials: ");
        String Amount = sn.nextLine();
        System.out.println("Dosage: ");
        String Dosage = sn.nextLine();
        
        clsInjection injection = new clsInjection(MedicineName, typ, Amount, Dosage);
        
        a.writeInjection(injection);
    }
    
    //--------------------------------------------------------------------------
    
    
    private static void print_prescription() {
        
        clsArchive a = new clsArchive();
    
        clsPrescription pre = new clsPrescription();
        pre.read_prescription();
        a.readPatient();
        a.readTablet();
        a.readLiquid();
        a.readInjection();
    }
}
