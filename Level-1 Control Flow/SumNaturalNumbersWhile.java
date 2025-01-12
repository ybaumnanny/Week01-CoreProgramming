/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/
import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();//Take the user input number and check whether it's a Natural number

        if (number >= 0) {
            int sum = 0;
			int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }
            int sumFormula = number * (number + 1) / 2;// formula for Sum
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + sumFormula);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
