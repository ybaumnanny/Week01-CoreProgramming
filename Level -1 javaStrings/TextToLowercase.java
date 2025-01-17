/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
*/
import java.util.Scanner;
public class TextToLowercase{
    public static String convertToLowercase(String input) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is uppercase and convert it to lowercase
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // ASCII difference between uppercase and lowercase
            }
            lowercaseText.append(c);
        }
        return lowercaseText.toString();
    }
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input as a complete text
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
        
        // Convert input to lowercase using String built-in method
        String builtInLowercase = userInput.toLowerCase();
        
        // Convert input to lowercase using the user-defined method
        String manualLowercase = convertToLowercase(userInput);
        
        // Compare the two results using the compareStrings method
        boolean comparisonResult = compareStrings(builtInLowercase, manualLowercase);
        
        // Display results
        System.out.println("Original Text: " + userInput);
        System.out.println("Lowercase (Built-in): " + builtInLowercase);
        System.out.println("Lowercase (Manual): " + manualLowercase);
        System.out.println("Comparison Result: " + (comparisonResult ? "Both are the same" : "Different"));
        
        // Close the scanner
        scanner.close();
    }
}
