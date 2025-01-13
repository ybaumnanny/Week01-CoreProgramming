/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/

import java.util.*;

public class LeapYearPartTWO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(isLeapYear(year));
    }

    public static String isLeapYear(int year) {
        if (year < 1582) {
            return "Invalid year. The Leap Year program only works for year >= 1582.";
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return year + " is a Leap Year.";
        } else {
            return year + " is not a Leap Year.";
        }
    }
}
