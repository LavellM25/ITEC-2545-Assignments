/**
 * Date: 1-25-2025
 * Author: Lavell McGrone
 *
 * Finish the method that checks if the answer to the quiz question is correct.
 *
 * You should accept answers in any case, but the spelling and spacing must be correct.
 *
 * (Tip: the answer is Bill Gates.)
 *
 */

import java.util.Scanner; // Added for user input handling

public class Question_2_Quiz_Question {

    public static void main(String[] args) {   // main method that will run the program

        System.out.println("Quiz time!");
        System.out.println("Which technology entrepreneur is supposed to have" +
                " said \"640K [of RAM] ought to be enough for anyone\" ?");
        String answer = stringInput("Enter your answer: "); // Store what user saids as a string

        // Will store the answer as a boolean value True/False if true answer correct, if not correct answer is false
        boolean correct = checkAnswer(answer);

        if (correct) { // conditional statement for the quiz response
            System.out.println("You are correct!");
        } else {
            System.out.println("Sorry, the answer is Bill Gates.");
        }

    }

    public static String stringInput(String prompt) {
        // Create a scanner object, System.in represents the standard input that will from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();  // prints the string passed as prompt to the console for the user.
    }

    public static boolean checkAnswer(String answer) {

        // TODO check that the user's answer is "Bill Gates" in any letter case.
        // Case doesn't matter, so "bill gates" or "BILL GATES" or any other variation in case is the correct answer.
        // Remember that using == to compare Strings may not do what you expect it to do!

        // Check the answer while ignoring case by using equalsIgnoreCase() method.
        // Added .trim() to remove any leading or trailing spaces from the user's input.
        return "Bill Gates".equalsIgnoreCase(answer.trim());
    }
}
