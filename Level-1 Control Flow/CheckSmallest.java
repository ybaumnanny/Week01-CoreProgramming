/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____*/

import java.util.Scanner;

public class CheckSmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = s.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
