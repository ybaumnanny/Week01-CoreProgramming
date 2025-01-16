/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.*;
public class NumberCheck{
	public int checkNumber(int number){
		if(number > 0){
			return 1;
		}
		else if (number <0){
			return -1;
}
else {
	return 0;
}
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // Create an object of the NumberCheck class
        NumberCheck numberCheck = new NumberCheck();
        // Call the checkNumber method using the object
        int result = numberCheck.checkNumber(number);

        // Print the result 
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
	