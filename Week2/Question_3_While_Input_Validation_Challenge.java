/**
 * Date: 2-1-2025
 * Author: Lavell McGrone

 * Added an extra feature to question 3, week 2 assignment that handle cases where the user enters non-integer input
 * (like letters, symbols, or blank input). This can be done using a try-catch block to handle InputMismatchException.
 */


import java.util.Scanner; // user-input 
import java.util.InputMismatchException; // Import exception handling for invalid input


public class Question_3_While_Input_Validation_Challenge {
    public static void main(String[] args) {
// Call the method to get the valid class code
        int code = getCollegeClassCode();

        // Display the valid code
        System.out.println("Thank you, your code is: " + code);
    }

    public static int getCollegeClassCode() {
        Scanner scanner = new Scanner(System.in);  // Scanner to read user input
        int code = 0; // Initialize code variable
        // Created a try-catch block to handle the case the user enter something that is not valid.

        while (true) { // Infinite loop until valid input is received
            System.out.print("Enter your college class code (1000 - 2999): ");

            try {
                code = scanner.nextInt(); // Try to read an integer

                // Check if input is within valid range
                // Validate the range (1000 - 2999)
                if (code >= 1000 && code <= 2999) {
                    break; // Exit loop when input is valid
                } else {
                    System.out.println("Invalid entry. Please enter a class code between 1000 and 2999. ");
                }
            } catch (InputMismatchException e) {
                // If input is not an integer, show error message
                System.out.println("Error: Please enter a valid integer between 1000 and 2999. ");
                scanner.next(); // Clear invalid input from scanner
            }
        }

        return code;  // Return valid code
    }
}

