/**
 * Date: 2-1-2025
 * Author: Lavell McGrone

 Write a program that prints only the program file names from an array.

 For this question, a program file is any file that ends with .py or .java or .cs

 For example, if a filenames array  = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }
 Then the program should print

 lab1.py
 Website.cs
 Calculator.java

 */

public class Question_5_Filter_Array {

    public static void main(String[] args) {

        // Some example String arrays, to help test the printProgramFiles method
//
//        String[] exampleFilenames1 = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" };
//        printProgramFiles(exampleFilenames1);   // This should print lab1.py, Website.cs and Calculator.java, one per line

        // example to test the logic
        String[] filenames = {"lab1.py", "assignment.docx", "music.mp3",
                "Website.cs", "Calculator.java", "accounting.xlsx", "lab2.py", "Arrays.java"};

        printProgramFiles(filenames); // from the array, pass in the method and the name of the array


//        String[] exampleFilenames2 = { "accounting.xlsx", "lab2.py", "Arrays.java" };
//        printProgramFiles(exampleFilenames2);   // This should print lab2.py and Arrays.java, one per line
    }


    public static void printProgramFiles(String[] filenames) {


        /* TODO complete this method. It should loop over the filenames array
        *   If the filename is a program code file then print the filename
        *   If not, then ignore it.
        *
        * A program file is any file that ends with .py or .java or .cs
        *
        * For example, if the filenames array  = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }
        * Then this method should print these filenames, one per line:
        *

        lab1.py
        Website.cs
        Calculator.java

        *
        * Don't print anything else.
        * */

        // Correct filtering: Uses endsWith() to check valid file extensions.
        // Removed numbering: Output should match expected format.
        for (String filename : filenames) {
            if (filename.endsWith(".py") || filename.endsWith(".java") || filename.endsWith(".cs")) {
                System.out.println(filename);
            }
        }
    }

}
