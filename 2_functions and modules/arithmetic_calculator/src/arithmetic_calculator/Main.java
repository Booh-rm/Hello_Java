package arithmetic_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Booh
 */
public class Main {


    public static void main(String[] args) {
        
         Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
            
            System.out.println("*☺****WELCOME****☺*"+ '\n');
            System.out.println("1. Calculate sum: (1)");
            System.out.println("2. Calculate subtract: (2)");
            System.out.println("3. Calculate multiplication: (3)");
            System.out.println("4. Calculate division: (4)");
            System.out.println("5. EXIT");
 
            try {
                System.out.println('\n' + "Enter a number to perform the operation:");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        sum();
                        break;
                    case 2:
                        subtract();
                        break;
                    case 3:
                        multiplication();
                        break;
                    case 4:
                        division();
                        break;
                    case 5:
                    System.err.println((char)27 + "[35;1m\n☻ HAS EXITED THE PROGRAM ☻\n");
                        exit = true;
                        break;
                    default:
                        System.out.println('\n' + "~~~YOU MUST ENTER ONLY NUMBERS BETWEEN 1 AND 5~~~" + '\n');
                }
            } 
            catch (InputMismatchException e) {
                System.out.println('\n' + "~~~YOU MUST ENTER A NUMBER~~~" + '\n');
                sn.next();
            }
        }

        //------------------------------------------------------------------------------------------------------------------
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
    private static void sum() {
       
        System.out.println('\n' + "----------------------------------------------------------------------------------" + '\n');
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two numbers for addition:" + '\n');
        System.out.println("Number 1:");
        double number_one = sn.nextDouble();
        System.out.println("Number 2:");
        double number_two = sn.nextDouble();
        
        double sum = cls_arithmetic.sum_numbers(number_one,number_two);
       
        System.out.println('\n' + "------------------------------");
        System.out.println("THE SUM IS: " + sum);
        System.out.println("------------------------------" + '\n');
        System.out.println("----------------------------------------------------------------------------------" + '\n');
    }

    //------------------------------------------------------------------------------------------------------------------
    
    private static void subtract() {

        System.out.println('\n' + "----------------------------------------------------------------------------------" + '\n');
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two numbers to subtract:" + '\n');
        System.out.println("Number 1:");
        double number_one = sn.nextDouble();
        System.out.println("Number 2:");
        double number_two = sn.nextDouble();
        
        double subtract = cls_arithmetic.subtract_numbers(number_one,number_two);
       
        System.out.println('\n' + "------------------------------");
        System.out.println("THE SUBTRACT IS: " + subtract);  
        System.out.println("------------------------------" + '\n');
        System.out.println("----------------------------------------------------------------------------------" + '\n');
    }

    //------------------------------------------------------------------------------------------------------------------
    
    private static void multiplication() {
     
        System.out.println('\n' + "----------------------------------------------------------------------------------" + '\n');
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two numbers to perform the multiplication:" + '\n');
        System.out.println("Number 1:");
        double number_one = sn.nextDouble();
        System.out.println("Number 2:");
        double number_two = sn.nextDouble();
        
        double multiplication = cls_arithmetic.multiply_numbers(number_one,number_two);
       
        System.out.println('\n' + "------------------------------");
        System.out.println("THE MULTIPLICATION IS: " + multiplication);
        System.out.println("------------------------------" + '\n');
        System.out.println("----------------------------------------------------------------------------------" + '\n');
    }

    //------------------------------------------------------------------------------------------------------------------
    
    private static void division() {
    
        System.out.println('\n' + "----------------------------------------------------------------------------------" + '\n');
        
        int num_0 =  0;
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two numbers to perform the division:" + '\n');
        System.out.println("Number 1:");
        double number_one = sn.nextDouble();
        System.out.println("Number 2:");
        double number_two = sn.nextDouble();
         
        if (number_two != num_0){
        double division = cls_arithmetic.divide_numbers(number_one,number_two);
        System.out.println('\n' + "------------------------------");
        System.out.println("THE DIVISION IS: " + division);
        System.out.println("------------------------------" + '\n');
        System.out.println("----------------------------------------------------------------------------------" + '\n');
        }
        
        while (number_two == num_0){
            System.out.println('\n' + "DIVISION BY 0 DOES NOT EXIST" + '\n');
            break;
        }
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
}
