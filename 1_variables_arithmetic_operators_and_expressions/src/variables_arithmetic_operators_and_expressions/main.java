
package variables_arithmetic_operators_and_expressions;

import java.util.Scanner;

/**
 *
 * @author Booh
 */
public class main {

    public static void main(String[] args) {
        
        //===========================================================================================
        //                          D A T A   E N T E R E D   B Y   U S E R
        //===========================================================================================
              
        System.out.println('\n' + "------------------------------------------------------------------------------------------------");

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the width of the door in meters: ");
        float width_door_mts = sn.nextFloat();
        System.out.println("Enter the diameter of the pulley in centimeters: ");
        float diameter_pulley_cms = sn.nextFloat();
        System.out.println("Enter the given minutes to close the door: ");
        float given_minutes = sn.nextFloat();
        
        System.out.println('\n' + "------------------------------------------------------------------");
        
        System.out.println("\033[1m" + "You have entered the following data:"  + "\033[0m" + '\n');
        System.out.println("The door width is: " + width_door_mts +  " meters");
        System.out.println("The pulley diameter is: " + diameter_pulley_cms + " centimeters");
        System.out.println("The minutes given to close the door are: " + given_minutes + " minutes");
        
        System.out.println('\n' + "------------------------------------------------------------------");
        
        
        //===========================================================================================
        //                      P R O B L E M   S O L V I N G   P R O C E S S
        //===========================================================================================
        
        System.out.println("\033[1m" + "Conversions and data to be used to solve the problem:" + "\033[0m" + '\n');
        double wall_height = width_door_mts;
        
        System.out.println("The height of the wall is: " + wall_height + " meters");
        
        System.out.println('\n' + "------------------------------------------------------------------" + '\n');
        
        double wall_height_in_cm = (wall_height*100)/1;
        System.out.println("The height of the wall in centimeters is: " + wall_height_in_cm + " centimeters" + '\n');
        
        double pulley_radius = diameter_pulley_cms/2;
        System.out.println("The pulley radius is: " + pulley_radius + " centimeters" + '\n');
        
        //---------------------------------------------------------------------------------------------------------------
        
        double number_of_turns;
        number_of_turns = (wall_height_in_cm)/((2*Math.PI) * pulley_radius);
        
        double Number_of_Chewbaccas;
        Number_of_Chewbaccas = (1*number_of_turns)/3;
        
        long chewbaccas;
        chewbaccas = Math.round(Number_of_Chewbaccas);
        
        double time_in_seconds;
        time_in_seconds = (given_minutes * 60)/1;
        
        double speed;
        speed = (wall_height_in_cm)/(time_in_seconds);
        
        System.out.println("The minutes given to close the door converted to seconds are: " + time_in_seconds + " seconds");
        
        System.out.println('\n' + "------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------"+ '\n');
        
        
        //===========================================================================================
        //                                    R E S U L T S
        //===========================================================================================
        
        System.out.println("The results obtained are as follows: " + '\n');
        System.out.println("The turns that must be made to close the door completely are: " + number_of_turns + " laps" + '\n');
        System.out.println("The number of Chewbaccas to use to close the door are: " + chewbaccas + " Chewbaccas" + '\n');
        System.out.println("The speed required to close the door in " + given_minutes + " minutes is from: " + speed + " cm/sec");
        
        System.out.println('\n' + "------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------" + '\n');
    }
    
}
