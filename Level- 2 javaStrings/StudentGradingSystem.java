/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/
import java.util.Random;
import java.util.Scanner;
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for each student
        int[][] scores = generateScores(numberOfStudents);

        // Calculate the total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Calculate grades based on percentage
        String[][] grades = calculateGrades(results);

        // Display the scorecard in tabular format
        displayScorecard(scores, results, grades);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects for each student

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100) + 1; // Random score between 1 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][4]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3;
            double percentage = (total / 300) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0; // Total, rounded to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average, rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage, rounded to 2 decimal places
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {
        int numberOfStudents = results.length;
        String[][] grades = new String[numberOfStudents][1];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        
        System.out.println("Student No | Physics | Chemistry | Math | Total | Average | Percentage | Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + " | ");
            }
            System.out.print(results[i][0] + " | " + results[i][1] + " | " + results[i][2] + " | " + grades[i][0]);
            System.out.println();
        }
    }
}
