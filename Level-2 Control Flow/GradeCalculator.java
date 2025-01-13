/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/
import java.util.*;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        

        // Calculate the total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);

        // Determine the grade and remarks
        String grade;
        String remarks;
        
        if (percentage >= 90) {
            grade = "A+";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "(Level 2, below agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "(Level 1, too agency-normalized standards)";
        } else {
            grade = "F";
            remarks = "(Remidial stnadards)";
        }

        // Display the results
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

		
		