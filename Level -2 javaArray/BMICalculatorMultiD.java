/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/


import java.util.Scanner;

public class BMICalculatorMultiD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of persons
        System.out.println("Enter the number of persons:");
        int numberOfPersons = input.nextInt();

        // 2D array to store weight, height, and BMI for each person
        double[][] dataOfPerson = new double[numberOfPersons][3]; // [][0] -> weight, [][1] -> height, [][2] -> BMI
        String[] weightStatus = new String[numberOfPersons];

        // Taking input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight for person " + (i + 1) + ":");
            dataOfPerson[i][0] = input.nextDouble();
            while (dataOfPerson[i][0] <= 0) {
                System.out.println("Please enter a positive weight value.");
                dataOfPerson[i][0] = input.nextDouble();
            }

            System.out.println("Enter height for person " + (i + 1) + ":");
            dataOfPerson[i][1] = input.nextDouble();
            while (dataOfPerson[i][1] <= 0) {
                System.out.println("Please enter a positive height value.");
                dataOfPerson[i][1] = input.nextDouble();
            }
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < numberOfPersons; i++) {
            dataOfPerson[i][2] = dataOfPerson[i][0] / (dataOfPerson[i][1] * dataOfPerson[i][1]);

            // Determine weight status
            if (dataOfPerson[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (dataOfPerson[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (dataOfPerson[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Data of person %d: Weight = %.2f kg, Height = %.2f m, BMI = %.2f, Status = %s\n", 
                              i + 1, dataOfPerson[i][0], dataOfPerson[i][1], dataOfPerson[i][2], weightStatus[i]);
        }

        // Closing the Scanner object
        input.close();
    }
}
