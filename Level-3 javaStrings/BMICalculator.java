import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine the status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // Array to store height, weight, BMI, and status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI

            // Determine the BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store results in the array
            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", heightInCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the 2D string array in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array to store weight and height

        // Input weight and height for 10 members
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMI(data);

        // Display results
        displayResults(results);

        input.close();
    }
}
