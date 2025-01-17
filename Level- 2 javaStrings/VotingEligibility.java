/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/
import java.util.Scanner;
import java.util.Random;
public class VotingEligibility {
    // Method to generate random ages for n students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(89) + 10; // Generates random age between 10 and 99
        }
        return ages;
    }
    // Method to check voting eligibility and return a 2D array with age and voting status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "True"; // Can vote
            } else {
                result[i][1] = "False"; // Cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----\t--------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // print output
        displayResults(votingResults);
    }
}
