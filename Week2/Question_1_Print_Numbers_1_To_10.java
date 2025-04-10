/**
 * Date: 1-30-2025
 * Author: Lavell McGrone

 Write a program that prints the numbers 1 to 10.

 Your loop should be in the printNumbers method. Use the method's `from` and `to`
 parameters in your code.

 Your method should work for any to and from numbers, not just 1 and 10.
 Make sure you use the method's parameters.

 Solved question with for loop. 

 */

public class Question_1_Print_Numbers_1_To_10 {
    public static void main(String[] args) {

//        int start = 1;
//        int end = 10;
//        printNumbers(start, end);
//        printNumbers(3, 7); // Tested logic to make sure it works and does what it supposed to do
        printNumbers(7, 2); // test logic in the case from > to, print #'s counting down
        printNumbers(-5, 5); // test logic that it still works if starting value (from) is negative
    }

    public static void printNumbers(int from, int to) {

        /* TODO Print all of the numbers between from and to.

        For example, if from = 1 and to = 10 then print
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10


        Use the parameters from and to in your loop, so if it's called with
        different numbers (for example, printNumbers(3, 7) the code will print

        3
        4
        5
        6
        7

       */

        // TODO write your code here.

        if (from > to) { // I will hand the case the first int value is larger than the second value
            for (int i = from; i >= to; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }
    }
}
