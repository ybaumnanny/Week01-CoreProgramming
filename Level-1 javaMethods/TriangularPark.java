/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.Scanner;
public class TriangularPark {
    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    // Method to calculate the number of rounds required to complete the run
    public static double calculateRounds(double peri, double dist) {
        return dist / peri;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the three sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Convert 5 km to meters (5000 meters)
        double distance = 5000;
        // Calculate the number of rounds required
        double rounds = calculateRounds(perimeter, distance);
		
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
    }
}
