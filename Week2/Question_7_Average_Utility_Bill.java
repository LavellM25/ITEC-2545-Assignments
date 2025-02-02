import java.util.Scanner;

/**
 * Date: 2-2-2025
 * Author: Lavell McGrone
 *
 Customers of a energy (gas, electricity) utility company have much larger bills in the cold winter than in the summer.

 The utility company allows customers to spread the cost of bills through the year by charging the average bill payment every month.

 So, the customer will pay the same amount every month, to make budgeting easier. A customer will pay less than their actual bill in the winter, and more than their actual bill in the summer. But over the year, they will pay the same total amount.

 The utility company averages all the last year's bills, and uses that to estimate the average payment for next year.

 Write a program to calculate the average bill for all 12 monthly bills.

 Ask the user for each month's bill for last year.
 Store this data in an array.
 Store January's bill in element 0, February's in element 1...

 Then, add up all the bills and calculate, and display the average.

 Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.

 Tip: use the `months` array provided, with the names of the months, to help ask for data and display data.
 */


public class Question_7_Average_Utility_Bill {

    // Use this array in your loops to help print questions like "What was your January bill?"   "What was your February bill?"
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

    public static void main(String[] args) {

        // You don't need to modify this method.

        Question_7_Average_Utility_Bill billsAverage = new Question_7_Average_Utility_Bill();
        billsAverage.billAverages();

    }

    private void billAverages() {

        // You don't need to modify this method
        double[] bills = getYearBills();
        double average = averageBillAmount(bills);
        System.out.println(String.format("Your average bill is %.2f", average));
        printBillTable(bills);

    }

    public double[] getYearBills() { // Get user's input for each month's bill

        // TODO ask user for bill amount for January, then February...
        // Create a new double array.
        // Store values the user enters in this array.
        // Return this array.
        // Use doubleInput(question) to ask the user for each bill amount.
        //   Why not positiveDoubleInput? A bill may be negative if the user overpaid in the previous month or received a credit.
        //   Use the form with the String argument, e.g. doubleInput("Enter bill amount");
        //   The test will fail if you use doubleInput() with no argument.

        // return null;  // TODO replace with your code

        Scanner scanner = new Scanner(System.in);
        double[] bills = new double[12]; // Create array to store 12 months' bills

        for (int i = 0; i < months.length; i++) {  // Create a for-loop that is going to ask the user for amount paid on
            // bill each month ex: January, Febuary, etc.
            System.out.print("Enter bill amount for " + months[i] + ": ");
            bills[i] = scanner.nextDouble(); // Store user input in array as a double to allow decimals
        }
        return bills;  // Return the filled array
    }


    public double averageBillAmount(double[] bills) { // Calculate the average bill

        // TODO Calculate the average value of all the bills, and return this number.
        // TODO make sure this method works with any length array.

        // return 0;  // TODO replace with your code

        double sum = 0; // initialize the bill amount to be 0.

        for (double bill : bills) {
            sum += bill; // Sum up all bills. For each bill month. Add this to the total
        }
        return sum / bills.length; // Compute average for all bill months
    }


    public void printBillTable(double[] bills) { // Print the bill table

        // TODO display the month name, and bill amounts, in table form.
        // TODO make sure this method works with any length array.
        // Use the months array to display the names.

        /* Replace these lines with your code. You'll need to use a loop to display all the months.
        String formatting is helpful. Here's some examples to space some columns with exactly 15 character width

        System.out.println(String.format("| %-15s| %-15s|", "Month", "Bill" ));
        System.out.println(String.format("| %-15s| %-15.2f|", "January", 44.5995 ));

        */
        System.out.println("\nBill Summary:");
        System.out.println(String.format("| %-15s | %-15s  |", "Month", "Bill ($)"));
        // Format and print the table header
        // %-15s → Left-aligns the "Month" column to 15 characters
        // %15s → Right-aligns the "Bill ($)" column to 15 characters
        System.out.println("-".repeat(38));

        // Loop through all months and corresponding bill amounts
        for (int i = 0; i < months.length; i++) {
            System.out.println(String.format("| %-15s | $%-15.2f |", months[i], bills[i]));
        }
        // Format and print each month's bill in a properly aligned column
        // %-15s → Left-aligns the month name to 15 characters
        // %15,.2f → Right-aligns the bill amount to 15 characters
        //   - `,` → Adds thousands separators (e.g., 1,000 instead of 1000)
        //   - `.2f` → Ensures two decimal places for proper formatting
    }
}
