/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.Scanner;

public class CheckLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
//printing the output using the && and the ? operator
        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2 ? "Yes" : "No"));
    }
}
