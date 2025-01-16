/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.*;\
public class TrigonometricFunctions {
    // Method to calculate various trigonometric functions (sine, cosine, tangent)
    public double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        // Convert angle to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        results[0] = Math.sin(radians);  // Sine
        results[1] = Math.cos(radians);  // Cosine
        results[2] = Math.tan(radians);  // Tangent
        return results;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an object of TrigonometricFunctions class to call the method
        TrigonometricFunctions obj = new TrigonometricFunctions();

        // Get the results for sine, cosine, and tangent
        double[] results = obj.calculateTrigonometricFunctions(angle);

        // Output the calculated values for sine, cosine, and tangent
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);

    }
}
