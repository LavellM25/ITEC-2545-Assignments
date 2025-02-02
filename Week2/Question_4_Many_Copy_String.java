import java.util.Scanner;

/**
 * Date: 2-1-2025
 * Author: Lavell McGrone
 *
 * Finish the multiplyString method to create a String from many copies of itself.
 * The user will decide how many copies to make.
 *
 * If the method is given the String "cat" and repeats = 3 copies, it will return "catcatcat".
 * If the method is given the String "Hello" and repeats = 5 copies, it will return "HelloHelloHelloHelloHello".
 *
 * If the method is given the String "Hello" and repeats = 1 copies, it will return "Hello".
 * If the method is given the String "Hello" and repeats = 0 copies, it will return "". (An empty String)
 * If the method is given the String "Hello" and repeats = -1 copies, or any negative number it will return "". (An empty String)

 */


public class Question_4_Many_Copy_String {
    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter your string to multiply: ");
        String input = scanner.nextLine();  // Read the full line input from user

        // Prompt the user to enter the number of copies
        System.out.print("How many copies to make? ");
        int copies = scanner.nextInt();  // Read an integer from user input

        // Call the multiplyString method to generate the repeated string
        String output = multiplyString(input, copies);

        // Print the result in a formatted way. %d and %s are format specifiers that do:
        // %d	Integer (int) format specifier (for numbers), so meaning: ➡️ String x amount of times
        // %s	String format specifier (for text), meaning ➡️ repeat string based on said x times
        System.out.println(String.format("Your String %d times is: %s", copies, output));

        // Close the scanner to prevent memory leaks
        scanner.close();

//        System.out.println(String.format("Your String %d times is: %s", copies, output));
    }
    public static String multiplyString(String userString, int repeats) {
        // TODO return a String that is made of multiple copies of userString.
        // The variable called repeats contains the number of copies.
        // So if userString = "Java" and repeats = 2 this method should return "JavaJava".
        // If userString = "Java" and repeats = 0, or repeats is negative, this method should return "" (an empty String)

        // TODO delete this line and replace this with your code
//        return null;

        // If the number of copies is 0 or negative, return an empty string
        if (repeats <= 0) {
            return "";
        }

        // Use a StringBuilder for efficient string concatenation
        /*
        I used StringBuilder for the following reasons:
        StringBuilder is mutable, meaning it can be modified without creating new objects.
        StringBuilder is faster for string concatenation (joining multiple strings, variables, in a single string)
        Use toString() to convert StringBuilder back to String.
         */
        StringBuilder result = new StringBuilder();

        // Loop to append the `userString` to the result `repeats` times
        for (int i = 0; i < repeats; i++) {
            result.append(userString);  // Append the string to itself
        }

        // Convert the StringBuilder result into a String and return it
        return result.toString();
    }
}
