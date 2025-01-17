/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;
public class IllegalArgumentExceptionDemo{
    public static void generateException(String text) {
        // Attempt to use substring with start index greater than the end index
        System.out.println(text.substring(5, 3)); 
    }
    // Method to demonstrate IllegalArgumentException handling
    public static void handleException(String text) {
        try {
            // Attempt to use substring with start index greater than the end index
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        // Call the method that generates the exception
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException in main: " + e.getMessage());
        }
        // Call the method that handles the exception
        handleException(text);
    }
}
