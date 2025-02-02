import java.util.Scanner;

/**

 Date: 2-1-2025
 Author: Lavell McGrone

 Write a program that asks for a college class code.
 A code must be a number between 1000 and 2999.

 Your program should validate that the class code entered is between 1000 and 2999.
 If it is not, then ask for the code again. Repeat until the user enters a valid class code.

 */

public class Question_3_While_Input_Validation {
    public static void main(String[] args) {

        int code = getCollegeClassCode();  // Call the method

        // Display the valid code
        System.out.println("Thank you, your code is: " + code);
    }

    public static int getCollegeClassCode() {

        Scanner scanner = new Scanner(System.in);  // Allow user input to the console
        int code;

        // Ask the user for input
        System.out.print("Enter your college class code (1000 - 2999): ");
        code = scanner.nextInt(); // whatever the user types in next will be the code that is trying to be tested.

        /*
         * TODO Complete this method.
         *
         * Use the intInput method to print a message asking the user for a class code. (don't use positiveIntInput.)
         *
         * A code must be a number between 1000 and 2999.
         * In case the user makes a mistake and enters a number lower than 1000 or more than 2999,
         * write a validation while loop. This loop should repeat while the data entered is invalid.
         *
         * When the user enters a valid code, the method will return the code entered.
         *
         * */

        // TODO delete this line and replace this with your code.
        while (code <= 1000 || code >= 2999) {
            System.out.println("Sorry, you made a mistake. Please enter a number lower than 1000 or more than 2999. ");
            code = scanner.nextInt();  // Re-prompt the user for input
        }
        return code;
    }
}

