/* Date: 1-20-2025
   Description: Add two numbers together and return its total.
   Author: Lavell McGrone
 */

import java.util.Scanner; // Import Scanner module to allow user input

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("This program will add two numbers.");

        // Get input from the user
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt(); // Convert user-input into an integer to store first #
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();  // Convert user-input into an integer to store second #

        // Call the method to add numbers
        int result = addNumbers(num1, num2);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close(); // Close the scanner
    }

    // Method to add two numbers and return the result
    public static int addNumbers(int num1, int num2) {
        int result = num1 + num2; // Add num1 and num2
        return result; // Return the result
    }
}
