/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". 

*/

import java.util.Random;
import java.util.Scanner;
//Creating class StudentScoreCalfor creating and displaying scorecard
public class StudentScoreCal{

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Random score for Physics (60-100)
            scores[i][1] = random.nextInt(41) + 60; // Random score for Chemistry (60-100)
            scores[i][2] = random.nextInt(41) + 60; // Random score for Math (60-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%\n");
        }
    }

    public static void main(String[] args) {
	
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);
		
		//closing scanner class object
        input.close();
    }
}