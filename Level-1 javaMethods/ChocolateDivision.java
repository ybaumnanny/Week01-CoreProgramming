/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/

import java.util.Scanner;
public class ChocolateDivision {
    public int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Chocolates each child gets
        result[1] = number % divisor;  // Remaining chocolates
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        ChocolateDivision obj = new ChocolateDivision();
        int[] result = obj.findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

    }
}
