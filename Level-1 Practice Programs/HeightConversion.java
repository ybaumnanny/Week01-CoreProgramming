/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.*;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightInCentimeters = input.nextDouble();
        double heightInInches = heightInCentimeters/ 2.54;
        int feet = (int) heightInInches / 12;
        int inches = (int) heightInInches % 12;

        System.out.println("Your Height in cm is" +heightInCentimeters+  "while in feet is"  + feet + "and inches is "+ inches);
    }
}
