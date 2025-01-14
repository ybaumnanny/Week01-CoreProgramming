/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/

import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        Scanner scanner = new Scanner(System.in);

        // Taking input for salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = getValidDoubleInput(scanner);

            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = getValidDoubleInput(scanner);
        }

        // Calculating bonuses and new salaries
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
            totalBonus += bonuses[i];
        }

        // Printing results
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary: " + totalNewSalary);
    }

    // Method to validate double input
    private static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double input = Double.parseDouble(scanner.nextLine());
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Please enter a valid positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
