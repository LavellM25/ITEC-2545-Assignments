/**
 * Date: 1-26-2025
 * Author: Lavell McGrone
 To upgrade to Windows 10, a computer needs to have:

 •	Either Windows 7 OR Windows 8 installed   AND
 •	1 GHz or faster processor   AND
 •	2 GB or more RAM

 Write a program that asks the user for the current version of their
 operating system, the CPU speed, and amount of RAM.

 You will need to use && and || operator in conditions to display a message telling the user
 if they are able to install Windows 10.

 Tip: if your program is failing the tests, check page 74 of Think Java, and/or look up short circuit evaluation.

 */

public class Question_6_Windows_10_Install {

    public static void main(String[] args) {

        // Prompt user for the current operating system
        String currentOS = stringInput("What is your current operating system?");

        // Prompt user for processor speed
        double processorSpeed = doubleInput("What is your current processor speed, in GHz?");

        // Prompt user for RAM size
        double ram = doubleInput("How much RAM do you have, in GB?");

        // Check if the system meets the requirements for upgrading to Windows 10
        boolean canUpgradeToWindows10 = checkWindows10SystemRequirements(currentOS, processorSpeed, ram);

        if (canUpgradeToWindows10) {
            System.out.println("You can upgrade to Windows 10");
        } else {
            System.out.println("Sorry, you can't upgrade to Windows 10");
        }
    }

    /**
     * Method to check if the system meets Windows 10 requirements.
     * - currentOS must be "Windows 7" or "Windows 8".
     * - processorSpeed must be at least 1 GHz.
     * - ram must be at least 2 GB.
     *
     * This method uses the logical OR (||) operator to check for valid OS versions and the logical AND (&&)
     * operator to ensure all other conditions are met simultaneously.
     */
    public static boolean checkWindows10SystemRequirements(String currentOS, double processorSpeed, double ram) {
        currentOS = currentOS.trim();

        // Check if the operating system is valid, and the hardware requirements are met
        // allow user to type "WINDOWS" and trim extra spaces
        return (currentOS.equalsIgnoreCase("Windows 7") || currentOS.equalsIgnoreCase("Windows 8"))
                && processorSpeed >= 1.0
                && ram >= 2.0;
    }

    /**
     * Method to get a string input from the user.
     * - Prompts the user with the given message and reads the input.
     * - Ensures the input is trimmed of leading/trailing whitespace for clean processing.
     */
    public static String stringInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextLine().trim();
    }

    /**
     * Method to get a double input from the user.
     * - Prompts the user with the given message and validates input is numeric.
     * - Keeps prompting until a valid number is entered.
     */
    public static double doubleInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();
    }
}
