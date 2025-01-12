/*Rewrite program 8 to do the countdown using the for-loop*/
import java.util.*;
public class CountDownFor{
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the countdown start number: ");
		int counter = scanner.nextInt();
		
		 for(int i =counter;  i >=1 ; i--){
		 System.out.println(i);
		 }
			 counter--;
	}

}