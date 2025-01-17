import java.util.Scanner;

public class StudentVoteChecker{

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate for negative age
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            // Check if the student can vote
            boolean canVote = voteChecker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
