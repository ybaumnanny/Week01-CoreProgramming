import java.util.*;

public class PalindromeCheck{

    //Logic 1: Iterative Approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        //Comparing characters from the start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  //Mismatched
            }
            start++;
            end--;
        }
        return true;  //All characters matched
    }

    //Logic 2: Recursive Approach
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        //Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }

        //If characters at start and end don't match, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        //Recursive call with updated indices
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //Logic 3: Using Character Arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        //Reversing the string using charAt()
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        //Comparing the original and reverse arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  //Mismatched
            }
        }
        return true;  //All characters matched
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //Palindrome using Logic 1 (Iterative)
        boolean resultIterative = isPalindromeIterative(inputText);
        System.out.println("Palindrome (Iterative): " + resultIterative);

        //Palindrome using Logic 2 (Recursive)
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome (Recursive): " + resultRecursive);

        //Palindrome using Logic 3 (Character Arrays)
        boolean resultCharArray = isPalindromeUsingCharArray(inputText);
        System.out.println("Palindrome (Using CharArray): " + resultCharArray);
		
		input.close();
    }
}
