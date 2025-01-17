/*
Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/
public class NullPointerExceptionDemo{
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }
    // Method to demonstrate NullPointerException handling
    public static void handleException() {
        String text = null;
        try {
            // Attempt to access a method on a null object
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Call the method that generates the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }
        // Call the method that handles the exception
        handleException();
    }
}
