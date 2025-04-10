// Date: 1-29-2025

import java.util.Scanner;

public class carJourney {
    public static void main(String[] args) {
        /* Write a program to calculate the MPG for a car journey. (MPG = Miles per gallon)
        calculate by dividing number of miles by number of gallons of gas used
        • Write a method that has two arguments:
        – a number of miles driven, and
        – a number of gallons of gas used on a car journey
        • Your method should calculate and return the MPG for the car journey
        • Your main method should
        – Ask the user for the miles and gas used
        – Call your method
        – Use the returned data to display the MPG
         */

        // Create a object for scanner
        Scanner scanner = new Scanner(System.in);  // allow user input

        // Ask the user for the # of miles driven
        System.out.println("Enter the number of miles driven: ");
        double miles_driven = scanner.nextDouble();

        // Ask the user for gallons of gas used
        System.out.println("Enter the number of gallons of gas used: ");
        double gallons_used = scanner.nextDouble();

        scanner.close();

        if (gallons_used == 0) {
            System.out.println("Gallons used cannot be zero. ");
        } else {
            // Call the MPG method
            double result = calculateMPG(miles_driven, gallons_used);
            // Display the result rounded to 2 decimal places
            System.out.printf("Miles per gallon (MPG): %.2f%n", result);
        }


//        System.out.println(calculateMPG(5, 7)); // test logic
    } public static double calculateMPG (double miles_driven, double gallons_used) {
        return (double) miles_driven / gallons_used;
    }

}
