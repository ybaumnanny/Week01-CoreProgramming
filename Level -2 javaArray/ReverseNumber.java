/*
You said:
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order*/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        temp = number;

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the digits in reverse order (since they are already in reverse in the array)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(); // For newline
    }
}
