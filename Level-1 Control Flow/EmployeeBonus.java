/*Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: ");// taking input
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;// calculate bonus of 5% to employees whose year of service is more than 5 years.
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("No bonus as years of service is less than or equal to 5.");
        }
    }
}
