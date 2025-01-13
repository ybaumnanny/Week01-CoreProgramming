/*
Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result

in java
*/
import java.util.*;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        

        // Check if the number is prime
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by i, not a prime
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
