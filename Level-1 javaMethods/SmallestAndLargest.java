/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/

import java.util.Scanner;

public class SmallestAndLargest {
    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];  // Array to store the smallest and largest numbers
        
        // Finding the smallest number
        result[0] = Math.min(Math.min(number1, number2), number3);  // Minimum of the three numbers
        
        // Finding the largest number
        result[1] = Math.max(Math.max(number1, number2), number3);  // Maximum of the three numbers
        
        return result;  // Return the result array containing smallest and largest numbers
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();  // Read the second number

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();  // Read the third number

        // Create an object of the class to call the instance method
        SmallestAndLargest obj = new SmallestAndLargest();
        
        // Call the method to find the smallest and largest numbers and store the result
        int[] result = obj.findSmallestAndLargest(number1, number2, number3);
        
        // Output the smallest and largest numbers
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        scanner.close();  // Close the scanner object
    }
}
