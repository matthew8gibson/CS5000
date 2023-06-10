// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

public class InputSum_Revised_Haddad {

   public static void main(String[] args) {
   
      {
      // setup section
         int sum = 0, value;
         String allEnteredNumbers = "";
         Scanner scan = new Scanner(System.in);
      
         ////////////////////////// added code ////////////////////////
         Scanner scan2 = new Scanner (System.in);
         String another = "y";
         while (another.equalsIgnoreCase("y")) // allows y or Y
         {
         ////////////////////////// end added code ////////////////////   
                  
            // Processing and taking input section
            System.out.print("Enter positive integers (-1 to quit): ");
            do {
            
               value = scan.nextInt();
               if (value > 0) { // not counting negative numbers
                  if (allEnteredNumbers != "") {
                  // not the first time, so include the comma
                     allEnteredNumbers = allEnteredNumbers.concat(", ");
                  }
               // only adding positive numbers
                  allEnteredNumbers = allEnteredNumbers.concat(String.valueOf(value));
                  sum = sum + value;
               
               } else {
               // negative numbers hit here. they are not added to the string or sum
               }
            // System.out.println("Debugging: The sum so far is " + sum);
            } while (value != -1); // end the loop when sentinel value is entered
         
            // output section
            System.out.println();
            System.out.println("Entered numbers:\t" + allEnteredNumbers);
            System.out.println("The Sum:\t\t" + sum);
         
            ////////////////////////// added code ////////////////////////
            allEnteredNumbers = "";  // reset string
            sum = 0;  //reset sum
            System.out.println();
            System.out.print ("Test another input (y/n)? ");
            another = scan2.nextLine();
            System.out.println();
            ///////////////////////// end added code //////////////////////
         
         } //end sentinel loop
      
         // cleanup
         scan.close(); // cleaning up resources
      }
   }
}

