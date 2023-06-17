
public class Scratch1 {

    public static void main (String[] args){
        System.out.println(FindPrimes (1, 100)); 
        
    }

    public static String FindPrimes(int floor,int ceiling){
        String output = "";
        boolean prime ; 
        //looping from 0 to the ceiling
        for (int i = floor + 1; i < ceiling; ++i){
            prime = true; 
            // now loop to test if this number is prime
            for (int j = 2; j <= i; ++j){
                if (i % j == 0){
                    // found it to be divisible, so not prime
                    prime = false;
                    // don't need to loop anymore
                    break; // exit this loop. 
                }
            }
            if (prime){
                output = output + i + " ";
            } // if false... then not keeping it in output.
        }
        return output.trim(); // trim remove the trailing space after last number. 
    }

}

/* 
Sure! Here's a Java programming question that involves loops:

Question:
Write a Java program that prints all the prime numbers between 1 and 100. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Your program should output the prime numbers separated by a space.

Hint: You can use a nested loop to check if a number is divisible by any number other than 1 and itself.

Example output:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

Write your code below:
*/