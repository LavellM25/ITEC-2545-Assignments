/**
 * Date: 1-25-2025
 * Author: Lavell McGrone

 To become a NASA astronaut, you need to be between 58 and 76 inches tall, so you
 are not too tall to fit in the spaceship, but are tall enough to reach all the controls.

 You also need to be able to swim at least 75 yards, in case you make a water landing on your return to earth.

 This program asks the user questions about their height and swimming ability.
 It calls a method to check if the user meets NASA's requirements.
 Finish the checkAstronautQualifications method by writing conditional statements
 to determine if the user has potential as a NASA astronaut. The method will return true or false.

 There are many ways of doing this too - once you've written and tested a solution,
 can you think of another way of doing it? Make sure your tests still pass.

 */

import java.util.Scanner; // Added for user input handling

public class Question_3_NASA_Astronauts {

    public static void main(String[] args) {   // main method that will run the program

        double height = doubleInput("How tall are you, in inches?");
        double swimDistance = doubleInput("How far can you swim, in yards?");

        // Will store the answer as a boolean value True/False, if answer meets qualifications this value will be true,
        // if not this value will be false
        boolean astronautPotential = checkAstronautQualifications(height, swimDistance);

        if (astronautPotential) {   // conditional statement for NASA requirements
            System.out.println("You have astronaut potential!");
        } else {
            System.out.println("Sorry, you don't meet NASA's requirements.");
        }

    }

    public static double doubleInput(String prompt) {
        // Create a scanner object, System.in represents the standard input that will from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + " ");

        // Created a while loop based on a condition if input from the user is not a valid response, handle error
        while (!scanner.hasNextDouble()) {   // ! logic meaning not a double value from the user.
            System.out.print("Please enter a valid number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();    // if the response is valid, return
    }

    public static boolean checkAstronautQualifications(double height, double swimDistance) {

        // TODO check if the height, and swim distance meet NASA's requirements.
        // (The user must be at least 58 inches tall but not more than 76 inches tall,
        // AND they must be able to swim 75 yards or more. )
        // return true if the user meets these qualifications
        // return false otherwise

        // Check if the user meets both height and swim distance requirements
        return (height >= 58 && height <= 76) && (swimDistance >= 75);
    }
}
