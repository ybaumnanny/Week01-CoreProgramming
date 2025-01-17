/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Attempt to access a character at an index beyond the string length
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }
    public static void handleException(String text) {
        try {
            // Attempt to access a character at an index beyond the string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException in main: " + e.getMessage());
        }
        handleException(text);
    }
}
