/**
 * Date: 1-30-2025
 *
 *  Write a program that prints the numbers 1 to 10.
 *
 *  Your loop should be in the printNumbers method. Use the method's `from` and `to`
 *  parameters in your code.
 *
 *  Your method should work for any to and from numbers, not just 1 and 10.
 *  Make sure you use the method's parameters.
 *  Solved by using a while-loop.
 */

public class Question1_whileLoop {
    public static void main(String[] args) {

//        printNumbers(1, 10);  // Normal case (counting up)
//        printNumbers(3, 7);   // Another normal case
//        printNumbers(7, 2);   // Reverse case (counting down)
        printNumbers(-5, 5);  // Case with negative numbers
    }

    public static void printNumbers(int from, int to) {
        // If counting up (from < to)
        // If from <= to, use while (i <= to) to print numbers counting up.
        // If from (starting value) is less than or equal to ending value (to), count up
        if (from <= to) {
            int i = from;
            while (i <= to) {
                System.out.println(i);
                i++; // Increment
            }
        }
        // If counting down (from > to)
        // If from > to, use while (i >= to) to print numbers counting down.
        // If from (starting value) is greater than or equal to ending value (to), count down
        else {
            int i = from;
            while (i >= to) {
                System.out.println(i);
                i--; // Decrement
            }
        }
    }
}
