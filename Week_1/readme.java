/* Date: 1-26-2025
   Description: The objective of this coding exercise is to write a small program that determines
                the number of days in a particular month. This is an extension version of /Loop_Year_Calculator.java
 */

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        // Test cases to check code logic
        System.out.println(getDaysInMonth(1, 2020)); // should return 31 since January always 31 days.
        System.out.println(getDaysInMonth(2, 2020)); // should return 29 since year 2020 qualifies as a leap year.
        System.out.println(getDaysInMonth(2, 2018)); // should return 28 since 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(6, -2020)); // should return -1 since year is outside the range of 1 to 9999.

    }
    public static boolean isLeapYear(int year) {
        // Validate the range (1 to 9999)
        if (year < 1 || year > 9999) {
            return false; // Invalid year, not in range
        }

        // Check leap year rules
        // will need to create a nested loop since each condition is deterministic on the previous statement.
        if (year % 4 == 0) {  // rule 1, year must be divisible by 4 evenly
            if (year % 100 == 0) {  // rule 2, year must be divisible by 100 evenly
                return year % 400 == 0; // Leap year if divisible by 400 evenly
            } else {
                return true;
            }
        }
        return false; // If year does not pass all 3 tests above, it is not a Leap year, return false
    }
    public static int getDaysInMonth(int month, int year) {
        // Check if month is between 1 and 12 and year between acceptable ranges of 1 and 9999
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Invalid input
        }
        // Create switch-case statements for more efficient comparison of months of year.
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Months with 31 days (January, March, May, July, August, October, December)
            case 4: case 6: case 9: case 11:
                return 30; // Months with 30 days (April, June, September, November)
            case 2: // February can have either 29 or 28 days depending on if there is a leap year.
                return isLeapYear(year) ? 29 : 28; // Leap year logic
            /* Logic breakdown:
            return isLeapYear(year) ? 29 : 28;
            isLeapYear(year): This checks if the year is a leap year (true or false).
            The ? means: "If the condition before it (isLeapYear(year)) is true, then..."
            29: This is what gets returned if the condition is true (leap year).
            The : means: "Otherwise (if the condition is false)..."
            28: This is what gets returned if the condition is false (not a leap year).

            Code written if an if-else statement is used:
            if (isLeapYear(year)) {
                return 29; // Leap year
            } else {
                return 28; // Not a leap year
            }
             */
            default:
                return -1; // Should never happen
        }
    }
}
