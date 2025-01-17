import java.util.Scanner;

public class FriendFinder {

    // Method to find the youngest among the friends
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar"; // Default name for comparison
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            youngest = "Anthony";
        }
        return youngest;
    }

    // Method to find the tallest among the friends
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar"; // Default name for comparison
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            tallest = "Anthony";
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height of the 3 friends
        System.out.println("Enter details for the 3 friends:");

        // Loop to take input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find and display the youngest and the tallest friend
        System.out.println("The youngest friend is: " + findYoungest(ages));
        System.out.println("The tallest friend is: " + findTallest(heights));

        scanner.close();
    }
}
