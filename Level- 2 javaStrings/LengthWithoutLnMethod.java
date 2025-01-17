/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.*;
public class LengthWithoutLnMethod {
    // Method to find the length of the string without using the length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // Try to access each character by index
                count++;  // Increment count for each valid character
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle exception when index goes out of bounds
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Find and display the length of the string using the user-defined method
        int customLength = findLength(userInput);
        // Print the results
        System.out.println("Length of the string using custom method: " + customLength);
        System.out.println("Length of the string using built-in method: " + userInput.length());
    }
}
