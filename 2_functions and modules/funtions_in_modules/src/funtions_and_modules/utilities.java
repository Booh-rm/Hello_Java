package funtions_and_modules;


public class utilities {

    //------------------------------------------------------------------------------------------------------------------
    
    public static String appear_creature(){
        String creature[] = {"Kraken", "Mermaids", "Whale", "Hippocampus", "Macaraprone", "Octopus", "Leviathans", "Hydras"};
        int index = (int)(Math.random()*8);
        return creature[index];
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
    public static String appear_location(){
        String location[] = {"port", "starboard", "bow", "stern"};
        int index = (int)(Math.random()*4);
        return location[index];
    }
    
    //------------------------------------------------------------------------------------------------------------------
}
