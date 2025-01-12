/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/
import java.util.Scanner;
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int sumFormula = number * (number + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + sumFormula);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
