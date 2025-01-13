/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

import java.util.*;

public class YoungestTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony";
        
        int tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);
    }
	
}
