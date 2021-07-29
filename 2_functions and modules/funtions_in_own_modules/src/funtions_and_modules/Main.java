package funtions_and_modules;

import java.util.Scanner;

/**
 *
 * @author Booh
 */
public class Main {

     public static stages st;
    public static persons per;

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        System.out.println('\n' + "Enter your ID number: ");
        int ID = sn.nextInt(); 
        
        Scanner nom = new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String name = nom.nextLine();
        
        System.out.println("Enter your e-mail address: ");
        String email = sn.next();
        
        boolean valid_email = per.is_a_valid_email(email);
        
        //------------------------------------------------------------------------------------------------------------------
        
        if (valid_email == true){
            System.out.println('\n' + "================================================================");
            System.out.println('\n' + "E-mail Verified" + '\n');
            
            Scanner ns = new Scanner(System.in);
            System.out.println("Do you have programming experience? (Yes, No): ");
            String is_programmer = ns.next();
            System.out.println('\n' + "------------------------------------------------------------" + '\n');
            
            //------------------------------------------------------------------------------------------------------------------
            
            boolean es_progr = st.is_prgmr(is_programmer);
            

            if (es_progr == true){
                
                Scanner ep = new Scanner(System.in);
                System.out.println('\n' + "Indicates in which programming language: ");
                String programming_language = ep.next();
                System.out.println('\n' + "------------------------------------------------------------" + '\n');

                System.out.println('\n' + "Enter your date of birth in DD/MM/YYYY format: ");
                String age = ep.next();
                System.out.println('\n' + "------------------------------------------------------------" + '\n');

                System.out.println("Your name is: " + name + ". Your ID is: " + ID + ". Your e-mail is: " + email);
                int age_1 = per.calculate_age(age);
                
                //------------------------------------------------------------------------------------------------------------------
                
                boolean obtain_stage = st.obtain_stage(is_programmer, programming_language, age); 
                
            }
            
            //------------------------------------------------------------------------------------------------------------------

            else if(es_progr == false){

                Scanner np = new Scanner(System.in);
                System.out.println('\n' + "Enter your date of birth in DD/MM/YYYY format: ");
                String age = np.next();
                System.out.println('\n' + "------------------------------------------------------------" + '\n');

                System.out.println("Your name is: " + name + ". Your ID is: " + ID + ". Your e-mail is: " + email);
                
                boolean obtain_st = st.age_1(age);

            }
            
            //------------------------------------------------------------------------------------------------------------------
        }
        
        else 
            System.out.println("¡¡¡You are possibly a terrorist!!!" + '\n' +
                                '\n'
                               + "================================================================");
        
    }
    
}
