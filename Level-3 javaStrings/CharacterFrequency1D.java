import java.util.*;

public class CharacterFrequency1D{

    //Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        //Converting the string to a character array
        char[] chars = text.toCharArray();
        
        //Creating an array to store frequencies of characters
        int[] frequency = new int[chars.length];
        
        //Creating an array to store the result the character and its frequency
        String[] result = new String[chars.length];
        
        //The string characters (Outer loop)
        for (int i = 0; i < chars.length; i++) {
            //If the character is already counted, skip it
            if (chars[i] == '0') {
                continue;
            }

            //Initialize frequency for the current character to 1
            frequency[i] = 1;
            
            //Loop through the rest of the string to find duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;  //Increment the frequency if a duplicate is found
                    chars[j] = '0';  //Marking the duplicate character to avoid counting again
                }
            }
        }

        //Creating the result array to store the character and its frequency
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {  // Only include characters that have not been marked as '0'
                result[index] = chars[i] + ": " + frequency[i];
                index++;
            }
        }

        //Trimming the result array to remove any empty spaces
        String[] trimmedResult = new String[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        // The frequency of characters
        String[] result = findCharacterFrequency(inputText);

        // Displaying the result
        System.out.println("\nCharacter Frequency:");
        for (String entry : result) {
            System.out.println(entry);
        }
		
		input.close();
    }
}
