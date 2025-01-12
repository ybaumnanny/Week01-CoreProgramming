/*Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___*/
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int temp = number1; //store value in temp
        number1 = number2;// number1 value in another number2
        number2 = temp;// swap the number

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
