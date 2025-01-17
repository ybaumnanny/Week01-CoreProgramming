/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/
import java.util.Scanner;
public class StringTrimmerSimple{
    // Method to find the start and end indices to trim leading and trailing spaces
    public static int[] findTrimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compae two strings using charAt()
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
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputText = scanner.nextLine();

        // trim
        int[] trimPoints = findTrimPoints(inputText);
        String trimmedCustom = customSubstring(inputText, trimPoints[0], trimPoints[1]);

        // Use built-in trim method for comparison
        String trimmedBuiltIn = inputText.trim();

        // Compare 
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // output
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are the two strings equal? " + areEqual);
    }
}
