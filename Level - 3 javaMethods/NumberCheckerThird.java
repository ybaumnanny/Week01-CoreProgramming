/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/

public class NumberCheckerThird {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
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

    // Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;
        int duckNumber = 1203;

        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedDigitsArray = reverseDigitsArray(digitsArray);
        System.out.print("Reversed digits array: ");
        for (int digit : reversedDigitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Are original and reversed arrays equal: " + areArraysEqual(digitsArray, reversedDigitsArray));
        System.out.println("Is Palindrome number: " + isPalindrome(number));
        System.out.println("Is Duck number (1203): " + isDuckNumber(duckNumber));
    }
}
