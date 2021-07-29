package funtions_and_modules;

public class stages {

 //------------------------------------------------------------------------------------------------------------------

    public static persons p;
    
    //------------------------------------------------------------------------------------------------------------------

    public static String capitalize(String str) {
    if(str == null || str.isEmpty()) {
        return str;
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public static boolean  is_prgmr(String is_programmer){
        
        String resp = "Yes";
        
        if (capitalize(is_programmer).contains(resp) == true){
            return true;
        }
        return false;
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public static boolean obtain_stage(String is_programmer, String programming_language, String age){
        
        String language = "Java";

        if(capitalize(programming_language).contains(language) == true){
            System.out.println('\n' + "You belong to Stage 1 of evacuation of the planet." + '\n');
            System.out.println("================================================================");
            return true;
        }

        else
            System.out.println('\n' + "You belong to the Stage 2 evacuation of the planet." + '\n');
            System.out.println("================================================================");
        return false;
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public static boolean age_1(String date){

        int age = p.calculate_age(date); 

        if (age >= 50){
            System.out.println('\n' + "You belong to Stage 4 of evacuation of the planet." + '\n');
            System.out.println("================================================================");
            return false;
        }

        System.out.println('\n' + "You belong to Stage 3 of evacuation of the planet." + '\n');
        System.out.println("================================================================");
        return true;
    }
    
    //------------------------------------------------------------------------------------------------------------------    
}
