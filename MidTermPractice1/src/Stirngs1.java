import java.util.Scanner;

public class Stirngss {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scan.nextLine();
        input = String.trim(input).toLowerCase();
        Boolean palindrome = true;
        // check to see if Palidrome
        // convert to Char Byte Array
        char[] charArray = input.toCharArray();
        for (int i = 0; i < (input.length() / 2); i++){
            if (charArray[i] != charArray[input.length() - i]){
                palindrome = false;
                // if not equal, then not a palindrome, so end.
                break;
            }
        }
        if (panlindrome){
            System.out.println("The string is a palindrome.");
        } else{
            System.out.println("The string is not a palindrome.");
        }
    }
}
