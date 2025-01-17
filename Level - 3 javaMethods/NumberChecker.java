/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

*/
import java.util.Arrays;

public class NumberChecker {

    public static void main(String[] args) {
        int number = 153;  // Example number to test

        int[] digits = storeDigits(number);
        boolean isDuck = isDuckNumber(number);
        boolean isArmstrong = isArmstrongNumber(number, digits);
        int[] largestSmallest = findLargestSmallest(digits);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestSmallest[0]);
        System.out.println("Smallest Digit: " + largestSmallest[1]);
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int number) {
        String numStr = Integer.toString(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int numberOfDigits = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, numberOfDigits);
        }
        return sum == number;
    }

    // Method to find the largest and smallest digits
    public static int[] findLargestSmallest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
        }
        return new int[]{largest, smallest};
    }
}
