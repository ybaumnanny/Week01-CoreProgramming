/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.*;
public class HandshakeCalculator {
    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get integer input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
    }
}
