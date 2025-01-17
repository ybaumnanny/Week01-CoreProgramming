/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/

import java.util.*;
public class StringCharacterComparison {
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }
    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = sc.next();
        // Using the user-defined method to get characters
        char[] userDefinedCharacters = getCharacters(inputString);

        // Using the built-in toCharArray() method
        char[] builtInCharacters = inputString.toCharArray();
        // Comparing the two arrays
        boolean areArraysEqual = compareCharArrays(userDefinedCharacters, builtInCharacters);

        // Displaying the results
        System.out.println("Characters using user-defined method: " + String.valueOf(userDefinedCharacters));
        System.out.println("Characters using built-in toCharArray() method: " + String.valueOf(builtInCharacters));
        System.out.println("Are both character arrays equal? " + areArraysEqual);
        // Demonstrating NullPointerException
        try {
            String nullString = null;
            // Attempting to call a method on a null object will throw NullPointerException
            char[] nullCharacters = nullString.toCharArray();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

   
    }
}
