package funtions_and_modules;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class persons {
    
    //------------------------------------------------------------------------------------------------------------------
    
    public static boolean is_a_valid_email(String email){
    
        char character = '*';
        char quantity_at = '@';
        char quantity_m ='m';
        int pos=0;
        int pos_2=0;
        int counter = 0;
        int counter_2 = 0;
        
        //------------------------------------------------------------------------------------------------------------------
        
        pos = email.indexOf(quantity_at);
        while (pos != -1){
            counter++;
            pos=email.indexOf(quantity_at,pos+1);
            
            if (counter != 1){
                System.out.println('\n' + "¡¡¡ Error !!!" + '\n');
                System.out.println("The email contains more than one @, or none at all." + '\n');
            return false;
            }
        }
        
        //------------------------------------------------------------------------------------------------------------------
        
        String domain = "@frontiers.co";
        int index = 2;
        char[] chararray = email.toCharArray();
        
        //------------------------------------------------------------------------------------------------------------------
        
        pos_2 = email.indexOf(quantity_m);
        while (pos_2 != -1){
            counter_2++;
            pos_2 = email.indexOf(quantity_m,pos_2+1);

            if (counter_2 >= 3 && email.contains(domain)==false){
                System.out.println('\n' + "¡¡¡ Error !!!" + '\n');
                System.out.println("The mail contains 3 or more repetitions of the letter m." + '\n');
                return false;
            }         
        }
        
        //------------------------------------------------------------------------------------------------------------------

        if (chararray[index]==character && email.contains(domain)==false){
            System.out.println('\n' + "¡¡¡ Erroneous mail !!!" + '\n');
            return false;
        }
        
        //------------------------------------------------------------------------------------------------------------------

        if (email.contains(domain) == false){
            System.out.println('\n' + "¡¡¡ Erroneous mail !!!" + '\n');
            return false;
        }
        
        //------------------------------------------------------------------------------------------------------------------
        
        String equal = "=";
        String m = "+";
        String ampersand = "&";

        if(email.contains(equal) == true && email.contains(domain) == false){
            System.out.println("¡¡¡ Erroneous mail !!!" + '\n');
            return false;
        }
        
        //------------------------------------------------------------------------------------------------------------------

        if (email.contains(m) == true && email.contains(domain) == false){
            System.out.println("¡¡¡ Erroneous mail !!!" + '\n');
            return false;
        }

        //------------------------------------------------------------------------------------------------------------------

        if (email.contains(ampersand) == true && email.contains(domain) == false){
            System.out.println("¡¡¡ Erroneous mail !!!" + '\n');
            return false;
        }
        
        //------------------------------------------------------------------------------------------------------------------

    return true;
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public static int calculate_age(String date){
        
        String date_born = date;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date_of_birth = LocalDate.parse(date, formatter);
        Period age = Period.between(date_of_birth, LocalDate.now());

        System.out.println(String.format("Your age is: " + "%d years, %d months, %d days",
        age.getYears(),
        age.getMonths(),
        age.getDays())); 

        return age.getYears();
    }
    
    //------------------------------------------------------------------------------------------------------------------
}
