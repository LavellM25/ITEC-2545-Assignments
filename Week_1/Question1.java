/**
 * Date: 1-25-2025
 * Author: Lavell McGrone
 * Ask the user how many miles they live from MCTC.

 Once the user has typed in their response,

 •	Display "You live more than 10 miles from MCTC" if they live more than 10 miles away,
 •	Display "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
 •	Display "You live less than 10 miles from MCTC" if they live less than 10 miles away.

 Use if – else if – else statements.

 */
import java.util.Scanner; // Added for user input

public class Question_1_Miles_From_MCTC {

    public static void main(String[] args) {           // main method that will run the program.
        // store the response from the user as miles that will be a double value to allow real-world #
        double miles = doubleInput("How many miles do you live from MCTC? ");

        // Call the milesFromMCTC method that will use if else-if - statements based on user-input
        String response = milesFromMCTC(miles);

        System.out.println(response);

    }

    public static double doubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        // Created a while loop based on a condition if input from the user is not a valid response, handle error
        // Will continue to ask user how many miles lived long as the condition is true.
        while (!scanner.hasNextDouble()) {   // ! logic meaning not a double value from the user.
            System.out.print("Please enter a valid number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();   // if the response is valid, return
    }

    public static String milesFromMCTC(double miles) {

        // TODO Use if - else if - else statements to return the correct String
        // Based on the user response, I will give the user a particular response printed.

        if (miles > 10) {
            return "You live more than 10 miles from MCTC";
        } else if (miles == 10) {
            return "You live exactly 10 miles from MCTC";
        } else {
            return "You live less than 10 miles from MCTC";
        }
    }
}
