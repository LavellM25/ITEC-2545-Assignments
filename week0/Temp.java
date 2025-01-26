/* Date: 1-16-2025
   Description: Temp.java assignment 
 */

public class Temp {
    public static void main(String[] args) {

        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4;
        double forecastLow = -3.7;
        double result = forecastHigh - forecastLow;

        // Round to one decimal place
        // I will use %.1f as a format specifier to meaning to round to 1 decimal place value. 
        String formattedResult = String.format("%.1f", result);


        System.out.println("On January 14, the difference between the high and low " +
                "temperatures is "+ formattedResult + "°F");

    }
}
