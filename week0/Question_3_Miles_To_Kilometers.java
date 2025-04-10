package week_0;
// Date: 1-21-2025
// Author: Lavell McGrone


import java.util.Scanner;

/**
 * Finish the milesToKilometers method.
 * This method should use the miles variable and convert it to the equivalent number of kilometers.
 */
public class Question_3_Miles_To_Kilometers {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number of miles
        System.out.println("Please enter a number of miles: ");
        double miles = scanner.nextDouble();

        // Use the milesToKilometers method to convert this value to kilometers
        double km = milesToKilometers(miles);

        // Print the value in kilometers
        System.out.println(miles + " miles is equivalent to " + km + " kilometers");

        // Close the scanner
        scanner.close();
    }

    /**
     * This method converts miles to kilometers.
     * @param miles the number of miles to convert
     * @return the equivalent distance in kilometers
     */
    public static double milesToKilometers(double miles) {
        // Conversion factor: 1 mile = 1.6 kilometers
        // Rounds the result to two decimal places
        return Math.round(miles * 1.6 * 100.0) / 100.0;
    }
}
