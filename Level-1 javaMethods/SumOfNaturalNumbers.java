/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.*;
public class SumOfNaturalNumbers {
  // Method to find the sum of first n natural numbers
    public int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {// Loop from 1 to n
            sum += i;// add each number to sum
        }
        return sum; // return the final sum
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
			 // Create an object of the class to call the instance method
            SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
            int sum = obj.findSumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

     
    }
}
