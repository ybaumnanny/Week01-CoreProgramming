/*write the 6th  program using while loop*/


import java.util.*;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
 
        // Check if the input is a positive integer
        if (number > 0) {
            int i = 0;  // Initialize counter variable
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;  // Increment the counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
		scanner.close();
    }
	
}
