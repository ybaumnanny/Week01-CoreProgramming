/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/

import java.util.Scanner;

public class WordLengthFinder {

    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the text into words using charAt() without using the built-in split() method
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count the number of words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = 0;
        int wordIndex = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Method to generate a 2D array containing words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest strings
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;

        for (String[] entry : wordsWithLengths) {
            int length = Integer.parseInt(entry[1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Use the custom split method to get words
        String[] words = customSplit(inputText);

        // Generate a 2D array with words and their lengths
        String[][] wordsWithLengths = wordsWithLengths(words);

        // Find the shortest and longest words
        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Display the result
        System.out.println("Shortest word length: " + shortestAndLongest[0]);
        System.out.println("Longest word length: " + shortestAndLongest[1]);

        scanner.close();
    }
}
