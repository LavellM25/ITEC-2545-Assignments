/**
 * Date: 1-25-2025
 * Author: Lavell McGrone
 * A parcel delivery company charges the following rates to ship a parcel.

 •	Up to and including 10 pounds: $2.15 per pound
 •	Up to and including 20 pounds: $1.55 per pound
 •	Up to and including 30 pounds: $1.15 per pound

 The shipping company does not ship parcels that weigh over 30 pounds.

 So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.

 Write a program that asks the user for the weight of a parcel and displays whether it can be shipped, and what it will cost.

 Optional extra: the most obvious solution to this problem uses if statements for the price bands. Can you think of a different way?  Hint – loops and arrays of price and max weights for price?

 */

public class Question_5_Parcel_Delivery {

    public static double MAX_WEIGHT = 30;   // Use this in the canShip method

    public static void main(String[] args) {

        // Don't modify the code in this method.

        double weight = doubleInput("Enter weight of parcel");

        boolean canShip = canShip(weight);

        if (canShip) {
            double price = calculatePrice(weight);
            // round the user-input value to two decimal places (%.2f)
            System.out.println(String.format("It will cost %.2f to send your %.2f pound parcel", price, weight));
        } else {   // round the user-input value to two decimal places (%.2f)
            System.out.printf("A parcel with weight %.2f can't be shipped.%n", weight);
            System.out.println("This weight " + weight + " is over the capacity of 30. ");
        }
    }


    public static boolean canShip(double weight) {
        // TODO return false if parcel weighs 0 or less
        // TODO return false if parcel weighs more than MAX_WEIGHT. Use the MAX_WEIGHT variable in this code

        // TODO otherwise, the parcel is more than 0 and less than or equal to MAX_WEIGHT. Return true.

        return weight > 0 && weight <= MAX_WEIGHT;
    }


    public static double calculatePrice(double weight) {

        // TODO assume parcel is a valid weight. Figure out price to ship this parcel.

        //  Parcel prices:
        //  Up to and including 10 pounds: $2.15 per pound
        //  Up to and including 20 pounds: $1.55 per pound
        //  Up to and including 30 pounds: $1.15 per pound

        // Create two arrays to
        double[] priceBands = {2.15, 1.55, 1.15};  // array priceBands for the price per pound in each weight category.
        double[] weightLimits = {10, 20, 30}; // array weightLimits for the maximum weight allowed in each category.

    // Create a for loop to loop through the arrays to determine the applicable price band based on the parcel’s weight
        // Ex: priceBands will have the weight limit of 10 with both positions in the array being 0.
        for (int i = 0; i < priceBands.length; i++) {
            if (weight <= weightLimits[i]) {
                return weight * priceBands[i];
            }
        }

        return 0; // Default case, shouldn't occur for valid weights
    }

    public static double doubleInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt + ": ");
        // while loop that will continue to prompt user if the response is not valid.
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();
    }
}
