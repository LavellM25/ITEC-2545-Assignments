/**
 * Date: 1-25-2025
 * Author: Lavell McGrone

 * USPS charges 49c to mail a standard, rectangular letter.

 USPS charges an extra 21c to mail a non-machinable letter,
 the type of letter that can't be processed by their mail-sorting machines.

 Rectangular letters can be processed by machine. Square, circular or other shaped letters can't be processed by machine.
 Letters must be flat to be processed by machine.
 Letters that are not flat (with bumps or have a curved shape) can't be processed by machine.

 Write a letter mailing price calculating program.

 Ask the user what shape their letter is - rectangular or not
 Ask the user if their letter is flat or not

 Calculate and display the cost to mail the letter.

 */

public class Question_4_Mail_Prices {

    // Some global constants. Use these variables in the calculateStampPrice method
    public final static int machinableLetterPrice = 49;
    public final static int nonMachinableSurcharge = 21;

    public static void main(String[] args) {

        boolean isRectangular = yesNoInput("Is the letter rectangular?");
        boolean isFlat = yesNoInput("Is the letter flat?");

        // Calculate price, in cents
        int price = calculateStampPrice(isRectangular, isFlat);  // call the method
// Print out the user input in a formatted string output
        System.out.println("Your letter will cost " + price + " cents to mail.");

        // Optional - if preferred, display the price as dollars and cents.
        System.out.printf("Your letter will cost $%.2f to mail.%n", price / 100.0);
    }

    /* Calculate and return the price, in cents, to mail the letter.  */

    public static int calculateStampPrice(boolean isRectangle, boolean isFlat) {

        /* TODO Calculate and return the price, in cents, to mail the letter.
         * Use the two boolean variables isRectangle and isFlat to figure out the cost.
         * Use the machinableLetterPrice and nonMachinableSurcharge variables declared above.
         */

        // If the letter is both rectangular and flat, it is machinable
        if (isRectangle && isFlat) {
            return machinableLetterPrice;
        }

        // Otherwise, add the non-machinable surcharge
        return machinableLetterPrice + nonMachinableSurcharge;
    }

    public static boolean yesNoInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt + " (yes/no): ");
                String response = scanner.nextLine().trim().toLowerCase();

                if (response.equals("yes")) {
                    return true;
                } else if (response.equals("no")) {
                    return false;
                    // if user does not enter a valid yes/no response, throw an exception and prompt user accordingly.
                } else {
                    throw new IllegalArgumentException("Invalid input. Please type 'yes' or 'no'.");
                }
    // if user provides an invalid input, I will prompt the user with the error message and to ask the user to enter a valid message.
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
