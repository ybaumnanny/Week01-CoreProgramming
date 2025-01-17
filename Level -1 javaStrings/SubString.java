/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.Scanner;

public class SubString {

    // Method to create a substring using charAt() method
    public static String subStringCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsCharAt(String str1, String str2) {
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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = sc.next();

        System.out.println("Enter the start index:");
        int startIndex = sc.nextInt();

        System.out.println("Enter the end index:");
        int endIndex = sc.nextInt();

        // Creating a substring using charAt() method
        String substringUsingCharAt = subStringCharAt(inputString, startIndex, endIndex);

        // Creating a substring using built-in substring() method
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        // Comparing the substrings
        boolean areSubstringsEqual = compareStringsCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying the results
        System.out.println("Substring using charAt() method: " + substringUsingCharAt);
        System.out.println("Substring using built-in substring() method: " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areSubstringsEqual);

        sc.close();
    }
}
