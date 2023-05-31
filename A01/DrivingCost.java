/*
 * Class:       CS 5000/W01
 * Term:        Summer 2023
 * Name:        Matthew Gibson
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  1
 * IDE       :  jGrasp
 */
 
import java.util.Scanner; //import scanner class
public class DrivingCost
{
   public static void main(String args[]) //program main method
   {
      //setup/input section
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the distance to drive (in miles):\t\t\t"); //prompt user for input
      double distance = s.nextDouble(); //read user input miles
      
      System.out.print("Enter the fuel efficiency of the car (in mpg):\t"); //prompt user for input
      double efficiency = s.nextDouble(); //read user input MPG
      
      System.out.print("Enter the cost of gas (in $/gallon):\t\t\t\t"); //prompt user for input
      double price = s.nextDouble(); //read user input $/gallon
      
      // calculations section
      double cost = distance / efficiency * price; // miles / mpg * cost of gas.

      // output section
      System.out.println(""); 
      System.out.println("The distance (miles):\t\t\t" + distance);
      System.out.println("Fuel efficiency (mpg):\t\t\t" + efficiency); 
      System.out.println("Price per gallon (dollars):\t$" + price);
      System.out.println("The trip cost (dollars):\t\t$" + cost); 
      System.out.println(""); 
      
      // end section
      // TODO: close Scanner object? 
   }
}