/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
*/
import java.util.*;
public class CheckVote{
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		int ages[]  = new int[10];
		
		System.out.println("Enter the 10 age : ");
		for(int i=0; i<ages.length; i++){ //creating loop for taking input for  all the values in the array.
		ages[i] = scanner.nextInt();//input taken
		}
		for(int i=0;i<ages.length;i++){// creating loop for checking vote eligibility.
			if(ages[i] <18){
			System.out.println("The student with the age" +ages[i] + "can't vote.");// print statement
			}
			else if(ages[i]<0){
				System.out.println("Invalid Age ");
			}
			else{
				System.out.println("The student with the age" + ages[i] + "can vote.");
			}
			
	                 
	}
	}
}