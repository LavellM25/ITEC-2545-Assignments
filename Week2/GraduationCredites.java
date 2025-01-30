// Date: 1-29-2025

/* Explanation: Created howManyCreditsToGraduate method:
            Takes two arguments (earned and required credits).
            Returns the remaining credits needed.
            Ensures the result is non-negative using Math.max(0, required - earned).
            Displayed output properly:
            If the user already has enough credits, they receive a congratulatory message.
            Otherwise, the program informs them how many credits they still need.
 */

import java.util.Scanner; // Import Scanner for user input

public class GraduationCredits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for credits earned
        System.out.print("Enter the number of credits you have earned: ");
        int creditsEarned = scanner.nextInt();

        // Ask the user for credits needed to graduate
        System.out.print("Enter the total number of credits needed to graduate: ");
        int creditsNeeded = scanner.nextInt();

        // Call the method to calculate remaining credits
        int creditsToGraduate = howManyCreditsToGraduate(creditsEarned, creditsNeeded);

        // Display the result
        if (creditsToGraduate <= 0) { // meaning user has successfully fulfilled the credits necessary and has graduated.
            System.out.println("Congratulations! You have enough credits to graduate.");
        } else { // student needs to still take more credits
            System.out.println("You need " + creditsToGraduate + " more credits to graduate.");
        }

        scanner.close(); // Close scanner
    }

    // Method to calculate remaining credits needed
    public static int howManyCreditsToGraduate(int earned, int required) {
        return Math.max(required - earned, 0); // Ensure non-negative result
    }
}
