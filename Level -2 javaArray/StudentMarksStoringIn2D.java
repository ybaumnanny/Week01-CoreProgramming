/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/
import java.util.Scanner;
//Creating class to store marks in 2D
public class StudentMarksStoringIn2D {
    public static void main(String[] args) {
		//creating object of scanner class for input
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students:");
        int totalStudent = input.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[totalStudent][3];
        double[] percentages = new double[totalStudent];
        char[] grades = new char[totalStudent];

        // Input marks for each student
        for (int i = 0; i < totalStudent; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = input.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Please enter a positive value.");
                    j--;
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < totalStudent; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display the results
		System.out.println("\nResults:");
		for (int i = 0; i < totalStudent; i++) {
			System.out.println("Student " + (i + 1) + ":");
			System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + 
                       ", Maths: " + marks[i][2]);
			System.out.printf("Percentage: %.2f%%, Grade: %c\n\n", percentages[i], grades[i]);
		}

		//closing the scanner object
        input.close();
    }
}