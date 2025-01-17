import java.util.Scanner;

public class TextSplitter {

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
        int wordCount = 0;

        // Count the number of words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = 0;
        int wordIndex = 0;

        // Extract words using charAt()
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays and return a boolean
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Use the custom split method
        String[] customSplitWords = customSplit(inputText);

        // Use the built-in split() method
        String[] builtInSplitWords = inputText.split(" ");

        // Compare the two string arrays
        boolean areArraysEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the result
        System.out.println("Are the two string arrays equal? " + areArraysEqual);

        scanner.close();
    }
}
