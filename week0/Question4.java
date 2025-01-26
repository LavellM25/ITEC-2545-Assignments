package week_0;
// Date: 1-21-2025
// Author: Lavell McGrone


import java.util.Scanner;

/**
 * Finish the triplicate method. This method should create a String from three exact copies of itself.
 * So if the method is given the String "cat", it will return "catcatcat".
 */

public class Question_4_Triplicate_String {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter your String to print in triplicate: ");
        String input = scanner.nextLine();

        // Call the triplicate method
        String output = triplicate(input);

        // Print the result
        System.out.println("Your String three times is: ");
        System.out.println(output);

        // Close the scanner
        scanner.close();
    }

    public static String triplicate(String oneString) {
        // Create a String that is three copies of the original String
        return oneString + oneString + oneString;
    }
}
