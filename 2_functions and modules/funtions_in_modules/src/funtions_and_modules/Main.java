package funtions_and_modules;

/**
 *
 * @author Booh
 */
public class Main {

    //------------------------------------------------------------------------------------------------------------------
    
    public static String capitalize(String str) {
    if(str == null || str.isEmpty()) {
        return str;
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
       
        //------------------------------------------------------------------------------------------------------------------
        
        String creature = capitalize(utilities.appear_creature());
        String location = capitalize(utilities.appear_location());
        
        //------------------------------------------------------------------------------------------------------------------

        System.out.println("--------------------------------------------");
        System.out.println(creature +" " + location);
        System.out.println("--------------------------------------------" + '\n');
        
        //------------------------------------------------------------------------------------------------------------------
        
        if (creature.startsWith("K") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("K") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("K")){
            System.out.println("Ahoy!  captain, one " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("Mer") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, some " + creature + " to " + location);
        }
        else if (creature.startsWith("Mer") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, some " + creature + " to " + location);
        }
        else if (creature.startsWith("Mer")){
            System.out.println("Ahoy!  captain, some " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("W") && location.startsWith("P")){
            System.out.println("Ahoy! captain, a " + creature + " to " + location);
        }
        else if (creature.startsWith("W") && location.startsWith("Sta")){
            System.out.println("Ahoy! captain, a " + creature + " to " + location);
        }
        else if (creature.startsWith("W")){
            System.out.println("Ahoy! captain, a " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("Hip") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("Hip") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("Hip")){
            System.out.println("Ahoy!  captain, one " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("Mac") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("Mac") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, one " + creature + " to " + location);
        }
        else if (creature.startsWith("Mac")){
            System.out.println("Ahoy!  captain, one " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("O") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, an " + creature + " to " + location);
        }
        else if (creature.startsWith("O") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, an " + creature + " to " + location);
        }
        else if (creature.startsWith("O")){
            System.out.println("Ahoy!  captain, an " + creature + " by the " + location);
        }
        
        else if (creature.startsWith("L") && location.startsWith("P")){
            System.out.println("Ahoy! captain, a few" + creature + " to " + location);
        }
        else if (creature.startsWith("L") && location.startsWith("Sta")){
            System.out.println("Ahoy! captain, a few" + creature + " to " + location);
        }
        else if (creature.startsWith("L")){
            System.out.println("Ahoy! captain, a few" + creature + " by the " + location);
        }
        
        else if (creature.startsWith("Hyd") && location.startsWith("P")){
            System.out.println("Ahoy!  captain, some " + creature + " to " + location);
        }
        else if (creature.startsWith("Hyd") && location.startsWith("Sta")){
            System.out.println("Ahoy!  captain, some " + creature + " to " + location);
        }
        else if (creature.startsWith("Hyd")){
            System.out.println("Ahoy!  captain, some " + creature + " by the " + location);
        }
        System.out.println('\n' + "--------------------------------------------");
        
        //------------------------------------------------------------------------------------------------------------------
    }
    
}
