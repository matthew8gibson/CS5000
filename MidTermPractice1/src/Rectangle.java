import java.util.Scanner;

public class Rectangle {
    
    public static void main (String[] args){
        // setup
        double length, width, area, perimeter;
        Scanner scan = new Scanner(System.in);
        
        // user input
        System.out.print("Enter the length: ");
        length = scan.nextDouble();
        
        System.out.print("Enter the width: ");
        width = scan.nextDouble();
        
        // calculations
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        
        // output
        System.out.println("Area: " + area);
        System.out.println("Perimter: " + perimeter);
        
        // cleanup
        scan.close();

    }
}
