/*
 * Class:       CS 5000/W01
 * Term:        Summer 2023
 * Name:        Matthew Gibson
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  1
 * IDE       :  jGrasp
 */
 
import java.util.Scanner; //import scanner class
public class SumDigits
{
   public static void main(String args[]) //program main method
   {
      //setup/input section
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter a 4-digit integer number:\t"); //prompt user for input
      int input = s.nextInt(); //read user input
      
      // calculations section: use math functions to determine the sum of its digits
      // Manipulate the input number mathematically using proper math operators (division and remainder) to determine the sum of its digits
      int output = 0;
      int working = input; // using a temp var to process the data. 
      while (working > 0)
      {
         output = output + (working % 10); // takes the last digit and adds it
         working = working / 10 ;// removes the last digit (truncated b/c of int datatype)         
         //System.out.println("Debugging - Processing working: " + working + ". Processing output: " + output );        
      }
      
      // output section
      System.out.println(); 
      System.out.println("The input number is:\t" + input); 
      System.out.println("The sum of digits is:\t" + output); 
      System.out.println(); 
      
      // end section
      // TODO: close Scanner object? 
   }
}