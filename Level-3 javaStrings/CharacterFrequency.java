import java.util.*;

public class CharacterFrequency{

    //Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        //Array to store the frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];
        
        //Looping through the string to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        //Creating a 2D array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2]; //2D array to store characters and their frequencies
        int index = 0;
		
        //The result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //The frequency of characters
        String[][] result = findCharacterFrequency(inputText);

        //Displaying the results
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
    }
}
