/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/
import java.util.*;
public class SpringSeason {
	public static boolean isSpringSeason(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        }

        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else if (month > 3 && month < 6) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int month , day;
		month  = scanner.nextInt();
		day = scanner.nextInt();
		

        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    
}
