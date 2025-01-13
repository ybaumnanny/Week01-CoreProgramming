/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result
*/

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
        scanner.close();
    }
}
