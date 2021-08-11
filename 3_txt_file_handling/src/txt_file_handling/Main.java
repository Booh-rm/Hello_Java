package txt_file_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Booh
 */
public class Main {

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
        
    //---------------------------------------------------------------------------
        
        String information  =
        "------------------------------------------------------------------------------------\n" +
        "|                                                                                  |\n" +
        "|                          T X T   F I L E   H A N D L I N G                       |\n" +
        "|                                                                                  |\n" +
        "|                                                                                  |\n" +
        "------------------------------------------------------------------------------------";
        
        System.out.println(information);
        
    //---------------------------------------------------------------------------
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
    //---------------------------------------------------------------------------
    
        while (!exit) {
            System.out.println("------------------------------------------------------------------------------------" + '\n');
            System.out.println(ANSI_GREEN + "*☺****WELCOME****☺*" + ANSI_RESET + '\n');
            System.out.println("1. Company Menu");
            System.out.println("2. Employee Menu");
            System.out.println("3. Customer Menu");
            System.out.println("4. EXIT");
 
            try {
                System.out.println('\n' + "Type one of the options:");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        menuCompanies();
                        break;
                    case 2:
                        menuEmployees();
                        break;
                    case 3:
                        menuCustomers();
                        break;
                    case 4:
                    System.err.println((char)27 + "[35;1m\n☻ HAS EXITED THE PROGRAM ☻\n");
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 4~~~" + '\n' + ANSI_RESET);
                }
            } 
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }

    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------
    
    private static void menuCompanies() {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_PURPLE + "*****MENU COMPANIES*****\n" + ANSI_RESET);
            System.out.println("1. Register company");
            System.out.println("2. Delete company");
            System.out.println("3. View company");
            System.out.println("4. Show total companies");
            System.out.println("5. Previous menu");
 
            try {
 
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        registerCompany();                       
                        break;
                    case 2:
                        deleteCompany();
                        break;
                    case 3:
                        viewCompany();
                        break;
                    case 4:
                        totalCompanies();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 5~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }
    
    private static void registerCompany() {

        //Creation of a file object:
        Files a = new Files();
        
        Scanner sn = new Scanner (System.in);
        
        System.out.println("Enter company name: ");
        String companyName = sn.nextLine();
        System.out.println("Enter the company's NIT: ");
        String NIT = sn.nextLine();
        System.out.println("Enter company address: ");
        String address = sn.nextLine();
        
        //Since a company must have employees, at least one employee must be added when registering a company.
        //-------------------------------------------------------------------------------------------------------
        
        System.out.println('\n' + "You must add at least one employee to the company, otherwise the company cannot exist: " + '\n');
        
        System.out.println("Enter the employee's name: ");
        String nameEmployee = sn.nextLine();
        System.out.println("Enter the employee's last name: ");
        String lastNameEmployee = sn.nextLine();
        System.out.println("Enter the employee's gender: ");
        String gender =sn.nextLine();
        System.out.println("Enter the employee's identification document number: ");
        String identificationDocument = sn.nextLine();
        System.out.println("Enter employee's e-mail address: ");
        String mail = sn.nextLine();
        System.out.println("Enter the employee's job title: ");
        String jobTitle = sn.nextLine();
        System.out.println("Enter the hierarchical level of the employee: ");
        String hierarchicalLevel = sn.nextLine();
        System.out.println("Enter the employee's salary: ");
        String salary = sn.nextLine();
        System.out.println("The employee is administrative (yes/no): ");
        String EmpSub = sn.nextLine();
        String reply = capitalize(EmpSub);
        
        //Creation of the employee's position:
        clsJobTitle employeePosition = new clsJobTitle(jobTitle, hierarchicalLevel);
        
        //Whether the employee is administrative or not:
        if("Yes".equals(reply)){
            System.out.println("Enter the category to which the administrative employee belongs: ");
            String category = sn.nextLine();
            
            //Since an administrative employee must be in charge of subordinate employees, the code of the subordinate employees he/she is in charge of must be entered:
            System.out.println("Enter the category code of the subordinate employees you are in charge of: ");
            String code = sn.nextLine();
            
            //Creation of a subordinate employee:
            clsSubordinateEmployees subordinate_employees = new clsSubordinateEmployees(null, code, null, null, null, null, null, null,null);
            
            //Creation of an administrative employee:
            clsAdministrativeEmployees administrative_employees = new clsAdministrativeEmployees(nameEmployee, salary, category, lastNameEmployee, gender,identificationDocument, mail, subordinate_employees, employeePosition,NIT);
            
            //The administrative employee is saved in the file: administrative_employees.txt:
            a.registerAdministrativeEmployees(subordinate_employees,employeePosition,administrative_employees);
        } 
        else{
            System.out.println('\n' + "Since the employee is not administrative, this means that he/she is a subordinate: ");
            System.out.println("Enter the code of the subordinate employee category to which you belong: ");
            String code = sn.nextLine();
            
            //Creation of a subordinate employee:
            clsSubordinateEmployees subordinate_employees = new clsSubordinateEmployees(nameEmployee, code, salary, lastNameEmployee, gender, identificationDocument, mail, employeePosition, NIT);
            
            //The subordinate employee is saved in the file: Employees_Subordinates.txt:
            a.registerSubordinateEmployee(employeePosition,subordinate_employees);
        }

        //-------------------------------------------------------------------------------------------------------    
        
        //Creating an employee:
        //clsEmployees employees = new clsEmployees(salary, employeePosition ,nameEmployee, lastNameEmployee, gender, identificationDocument, mail,NIT);
        clsEmployees employees = new clsEmployees(salary, employeePosition ,nameEmployee, lastNameEmployee, gender, identificationDocument, mail, NIT);

        //-------------------------------------------------------------------------------------------------------    
        
        //Creation of a company:
        clsCompanies company = new clsCompanies(companyName, NIT, address, employees);
        
        //The company is kept on file: company.txt:
        a.writeCompanies(company);
        
        //All the companies registered in the system are displayed; from the file companies.txt:
        {System.out.print("\nCurrent Companies:" + '\n');
        a.showCompany();
        }        
    }

    private static void deleteCompany() {

        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);

        {System.out.print("Current Companies:\n");
        a.showCompany();}
       
        //The NIT is requested since it is unique per company:
        System.out.println("Enter the NIT of the company to be deleted: ");
        String nitCompany = sn.nextLine();
        
        //The company is removed from the companies.txt file:
        a.removeCompany(nitCompany);
       
        {System.out.print('\n' + "CURRENT COMPANIES:\n");
        a.showCompany();}
    }
        
    private static void viewCompany() {

        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);

        System.out.println("Type the NIT of the company you are looking for: ");
        String nitCompany = sn.nextLine();
        
        //The company is searched for in the file companies.txt:
        a.searchCompany(nitCompany);
        
    }
    
    private static void totalCompanies(){

        Files a = new Files();
        
        System.out.println("Total companies:");
        
        //All the companies registered in the system are displayed:
        a.showCompany();
    }

    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------

    private static void menuEmployees() {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_PURPLE + "*****EMPLOYEES MENU*****\n" + ANSI_RESET);
            System.out.println("1. Register employee");
            System.out.println("2. Remove employee");
            System.out.println("3. View employee");
            System.out.println("4. Show total employees");
            System.out.println("5. Previous menu");
 
            try {
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        registerEmployees(); 
                        break;
                    case 2:
                        removeEmployees();
                        break;
                    case 3:
                        viewEmployee();
                        break;
                    case 4:
                        totalEmployees();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 5~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }
    
    private static void registerEmployees(){
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_CYAN + "*****REGISTER EMPLOYEES*****\n" + ANSI_RESET);
            System.out.println("1. Register administrative employees");
            System.out.println("2. Register subordinate employees");
            System.out.println("3. Previous menu");
 
            try {
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        registerAdministrativeEmployees();
                        break;
                    case 2:
                        registerSubordinateEmployees();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 3~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }  
    }

    private static void registerAdministrativeEmployees(){

        Files a = new Files();
        
        Scanner sn = new Scanner (System.in);
        
        //-------------------------------------------------------------------------------------------------------

        System.out.println("Enter the employee's name: ");
        String nameEmployee = sn.nextLine();
        System.out.println("Enter the employee's last name: ");
        String lastNameEmployee = sn.nextLine();
        System.out.println("Enter the employee's gender: ");
        String gender =sn.nextLine();
        System.out.println("Enter the employee's identification document number: ");
        String identificationDocument = sn.nextLine();
        System.out.println("Enter employee's e-mail address: ");
        String mail = sn.nextLine();
        System.out.println("Enter the employee's job title: ");
        String jobTitle = sn.nextLine();
        System.out.println("Enter the hierarchical level of the employee: ");
        String hierarchicalLevel = sn.nextLine();
        System.out.println("Enter the employee's salary: ");
        String salary = sn.nextLine();
        System.out.println("Enter the category to which the administrative employee belongs: ");
        String category = sn.nextLine();
        System.out.println("Enter the category code of the subordinate employees you are in charge of: : ");
        String code = sn.nextLine();
        System.out.println(ANSI_RED + '\n' + "------------------------------------------------------" + ANSI_RESET);
        System.out.println("Current Companies:");
        System.out.println("");
        a.showCompany();
        System.out.println(ANSI_RED + "------------------------------------------------------" + '\n' + ANSI_RESET);
        System.out.println("Enter the NIT of the company to which the employee belongs: ");
        String nitEmp =sn.nextLine();
        System.out.println('\n' + "The employee will belong to the next company found:" + '\n');
        System.out.println("------------------------------------------");
        a.searchCompany(nitEmp);
        System.out.println("------------------------------------------");
        
        clsJobTitle employeePosition = new clsJobTitle(jobTitle, hierarchicalLevel);

        clsSubordinateEmployees sbEmpl = new clsSubordinateEmployees(null, code, null, null, null, null, null, null, null);
        
        clsAdministrativeEmployees employees = new clsAdministrativeEmployees(nameEmployee, salary, category, lastNameEmployee, gender,identificationDocument, mail, sbEmpl, employeePosition, nitEmp);
        
        System.out.println("The employee has been added correctly.");
        
        a.registerAdministrativeEmployees(sbEmpl, employeePosition, employees);
    }

    private static void registerSubordinateEmployees(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner (System.in);
        
        //-------------------------------------------------------------------------------------------------------

        System.out.println("Enter the employee's name: ");
        String nameEmployee = sn.nextLine();
        System.out.println("Enter the employee's last name: ");
        String lastNameEmployee = sn.nextLine();
        System.out.println("Enter the employee's gender: ");
        String gender =sn.nextLine();
        System.out.println("Enter the employee's identification document number: ");
        String identificationDocument = sn.nextLine();
        System.out.println("Enter employee's e-mail address: ");
        String mail = sn.nextLine();
        System.out.println("Enter the employee's job title: ");
        String jobTitle = sn.nextLine();
        System.out.println("Enter the hierarchical level of the employee: ");
        String hierarchicalLevel = sn.nextLine();
        System.out.println("Enter the employee's salary: ");
        String salary = sn.nextLine();
        System.out.println(ANSI_RED + '\n' + "------------------------------------------------------" + ANSI_RESET);
        System.out.println("Current Companies:");
        System.out.println("");
        a.showCompany();
        System.out.println(ANSI_RED + "------------------------------------------------------" + '\n' + ANSI_RESET);
        System.out.println("Enter the NIT of the company to which the employee belongs: ");
        String nitEmp =sn.nextLine();
        System.out.println('\n' + "The employee will belong to the next company found:" + '\n');
        System.out.println("------------------------------------------");
        a.searchCompany(nitEmp);
        System.out.println("------------------------------------------");

        System.out.println("Enter the code of the subordinate employees to which it belongs: ");
        String code = sn.nextLine();

        clsJobTitle employeePosition = new clsJobTitle(jobTitle, hierarchicalLevel);

        clsSubordinateEmployees sbEmpl = new clsSubordinateEmployees(nameEmployee, code ,salary, lastNameEmployee, gender, identificationDocument, mail, employeePosition,nitEmp);
        
        System.out.println("The employee has been added correctly.");

        a.registerSubordinateEmployee(employeePosition, sbEmpl);
    }
    
    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    private static void removeEmployees(){
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_CYAN + "*****REMOVE EMPLOYEES*****\n" + ANSI_RESET);
            System.out.println("1. Remove Administrative employees");
            System.out.println("2. Remove subordinate employees");
            System.out.println("3. Previous menu");
 
            try {
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        removeAdministrativeEmployees();
                        break;
                    case 2:
                        removeSubordinateEmployees();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 3~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }
    
    private static void removeAdministrativeEmployees(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
            
        {System.out.print("Current Employees:\n");
        a.ShowAdministrativeEmployees();}
       
        //The identification document must be entered, since it is unique for each employee:
        System.out.println("Enter the ID number of the employee to be deleted: ");
        String idEmployee = sn.nextLine();
        
        a.removeAdmEmp(idEmployee);
       
        //The employees still registered in the system are shown:
        {System.out.print('\n' + "CURRENT EMPLOYEES:\n");
        a.ShowAdministrativeEmployees();} 
    }
    
    private static void removeSubordinateEmployees(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
            
        {System.out.print("Current Employees:\n");
        a.showSubordinateEmployees();}
       
        System.out.println("Enter the ID number of the employee to be deleted: ");
        String idEmployee = sn.nextLine();
        
        a.removeSubEmp(idEmployee);
       
        {System.out.print('\n' + "CURRENT EMPLOYEES:\n");
        a.showSubordinateEmployees();}
    }

    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    private static void viewEmployee(){
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_CYAN + "*****VIEW EMPLOYEES*****\n" + ANSI_RESET);
            System.out.println("1. View administrative employees");
            System.out.println("2. View subordinate employees");
            System.out.println("3. Previous menu");
 
            try {
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        viewAadministrativeEmployees();
                        break;
                    case 2:
                        viewSubordinateEmployees();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 3~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }
    
    private static void viewAadministrativeEmployees(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("type the ID number of the employee to search for: ");
        String idEmployee = sn.nextLine();
        
        a.searchAdministrativeEmployee(idEmployee);
    
    }
    
    private static void viewSubordinateEmployees(){
    
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("type the ID number of the employee to search for: ");
        String idEmployee = sn.nextLine();
        
        a.searchSubordinateEmployee(idEmployee);
    }
    
    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    private static void totalEmployees(){
        
        Files a = new Files();
        
        System.out.println("Total employees:" + '\n');
        
        System.out.println("Total Administrative Employees:" + '\n');
        a.ShowAdministrativeEmployees();
        System.out.println('\n' + "-----------------------------------------------------------------------------------------" + '\n');
        System.out.println('\n' + "Total Subordinate Employees:" + '\n');
        a.showSubordinateEmployees();
    }
   
    //---------------------------------------------------------------------------

    //---------------------------------------------------------------------------
    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------
    
    private static void menuCustomers() {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
            System.out.println("---------------------------------------------------------" + '\n');
            System.out.println(ANSI_PURPLE + "*****CUSTOMER MENU*****\n" + ANSI_RESET);
            System.out.println("1. Register customers");
            System.out.println("2. Remove customers");
            System.out.println("3. View customer");
            System.out.println("4. Show total customers");
            System.out.println("5. Previous menu");
 
            try {
                System.out.println('\n' + "Type one of the options:\n");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        registerCustomers();
                        break;
                    case 2:
                        removeCustomers();
                        break;
                    case 3:
                        viewCustomer();
                        break;
                    case 4:
                        totalCustomers();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + ANSI_RED + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 y 5~~~" + '\n' + ANSI_RESET);
                }
            }
            catch (InputMismatchException e) {
                System.out.println('\n' + ANSI_RED  +  "~~~YOU MUST ENTER A NUMBER~~~" + '\n' + ANSI_RESET);
                sn.next();
            }
        }
    }
    
    private static void registerCustomers(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner (System.in);

        //-------------------------------------------------------------------------------------------------------
        
        System.out.println('\n' + "Enter the customer's name: ");
        String nameC = sn.nextLine();
        System.out.println("Enter the customer's last name: ");
        String lastNameC = sn.nextLine();
        System.out.println("Type the customer's gender: ");
        String genderC =sn.nextLine();
        System.out.println("Enter the customer's identification document number: ");
        String idC = sn.nextLine();
        System.out.println("Type customer's e-mail address: ");
        String mail = sn.nextLine();
        System.out.println("Enter the customer's correspondence address: ");
        String addressC = sn.nextLine();
        System.out.println("Type the customer's phone number: ");
        String phone = sn.nextLine();
        System.out.println(ANSI_RED + '\n' + "------------------------------------------------------" + ANSI_RESET);
        
        //Since a customer must belong to a company, you must choose the company belonging to the company:
        System.out.println("Current companies:");
        System.out.println("");
        
        //The companies registered in the system are shown:
        a.showCompany();
        
        System.out.println(ANSI_RED + "------------------------------------------------------" + '\n' + ANSI_RESET);
        
        //The NIT is requested since it is unique per company:
        System.out.println("Enter the NIT of the company to which the customer belongs: ");
        String nitCom =sn.nextLine();
        
        System.out.println('\n' + "The customer will belong to the following company found:" + '\n');
        System.out.println("------------------------------------------");
        
        //Displays the company to which the customer will belong:
        a.searchCompany(nitCom);
        System.out.println("------------------------------------------");
        
        clsCustomers customers = new clsCustomers(nameC, addressC, phone, lastNameC, genderC, idC, mail, nitCom);
        
        System.out.println("Customer has registered correctly." + '\n');
        
        //The customer is saved in the file: customers.txt:
        a.registerCustomers(customers);
        
        //Customer data is displayed:
        System.out.println('\n' + "CURRENT CUSTOMERS:" + '\n');
        a.showCustomers();
        
        //-------------------------------------------------------------------------------------------------------
    }
    
    private static void removeCustomers(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
            
        {System.out.print("Current customers:\n" + '\n');
        a.showCustomers();}
       
        System.out.println("Enter the customer identification number of the customer to be deleted: ");
        String idC = sn.nextLine();
        
        a.removeCustomer(idC);
       
        //Customers still registered in the system are shown.
        {System.out.print("CURRENT CUSTOMERS:" + '\n');
        a.showCustomers();}
    }
    
    private static void viewCustomer(){
        
        Files a = new Files();
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter the identification number of the customer to search for: ");
        String idC = sn.nextLine();
        
        a.searchCustomers(idC);
        
    }
    
    private static void totalCustomers(){
        
        Files a = new Files();
        
        System.out.println("Total customers:" + '\n');
        a.showCustomers();
    }
    
    //---------------------------------------------------------------------------
}
