/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
*/
import java.util.*;
public class SamMarks {
    public static void main(String[] args) {
        int physicsMarks = 95;
        int mathsMarks = 94;
        int chemistryMarks = 96;
        
        int sum = physicsMarks + mathsMarks + chemistryMarks;
        
        double average = sum / 3.0;
        
        System.out.println("Sam's average mark in PCM is " + average + "%");
    }
}
