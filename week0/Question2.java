package week_0;
// Date: 1-21-2025
// Author: Lavell McGrone

import java.util.Scanner;

/**

 Finish the shout() method. It should convert a String to uppercase, and add "!!!" to the end.
 So if the user enters "hello", the method will be called with "hello".
 The method will turn "hello" into "HELLO!!!" and return this.

 */



import java.util.Scanner;

/**
 * Finish the shout() method. It should convert a String to uppercase, and add "!!!" to the end.
 * So if the user enters "hello", the method will be called with "hello".
 * The method will turn "hello" into "HELLO!!!" and return this.
 */
public class Question_2_Shout {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to be shouted: ");
        String usersString = scanner.nextLine();

        // Call the shout method and store the result
        String toShout = shout(usersString);

        // Print the shouted string
        System.out.println(toShout);

        scanner.close(); // Close the scanner
    }

    public static String shout(String shoutThis) {
        // Convert the input string to uppercase and add "!!!" at the end
        return shoutThis.toUpperCase() + "!!!";
    }
}
