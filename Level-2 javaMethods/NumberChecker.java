import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // Method to check if a number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check for each number if it is positive, negative, even, or odd
        for (int i = 0; i < 5; i++) {
            String sign = isPositive(numbers[i]);
            if (sign.equals("positive")) {
                System.out.println(numbers[i] + " is positive and " + isEvenOrOdd(numbers[i]) + ".");
            } else if (sign.equals("negative")) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        scanner.close();
    }
}
