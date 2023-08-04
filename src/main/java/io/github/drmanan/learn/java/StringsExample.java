/**
 * <H2> StringsExample </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Saturday, 05 of August, 2023; 03:00:08
 */

package io.github.drmanan.learn.java;

public class StringsExample {

    public static void main(String[] args) {
        // Strings are used for storing text.
        // collection of characters surrounded by double quotes

        String hello = "Hello World";
        System.out.println(hello);

        // Some methods/functions on Strings

        // Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // Upper and lower case
        System.out.println(hello.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(hello.toLowerCase());   // Outputs "hello world"

        // Index of // find position of text in String
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        /*
        Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third ...
        */

        // Concatenation
        // The + operator can be used between strings to combine them.
        // This is called concatenation:

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        // Note that I have added an empty text (" ") to create a space between firstName and lastName on print.

        // You can also use the concat() method to concatenate two strings:
        System.out.println(firstName.concat(lastName));

        /*
        * WARNING!
        Java uses the + operator for both addition and concatenation.
        Numbers are added. Strings are concatenated.
        */

        // If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(z);

        // If you add two strings, the result will be a string concatenation:
        String a = "10";
        String b = "20";
        String c = a + b;  // c will be 1020 (a String)
        System.out.println(c);

        // If you add a number and a string, the result will be a string concatenation:
        c = a + x;
        System.out.println(c);

        // Special Characters
        // The Escape

        /*
        * Consider the following sentence:
        *   Not everyone in the USA is "American".
        * Since the last word is in quotes, and we also need quotes to declare a sentence,
        * We need a trick to let the system know to print quotes.
        *
        * Because strings must be written within quotes, Java will misunderstand this string.
        * The solution to avoid this problem, is to use the backslash escape character.
        * */

        // The sequence \"  inserts a double quote in a string:

        txt = "Not everyone in the USA is \"American\".";
        System.out.println(txt);

        // Similarly, The sequence \'  inserts a single quote in a string:
        txt = "It\'s all good here."; // Not necessary in newer versions.
        System.out.println(txt);

        // Same for the backslash
        txt = "The character \\ is called backslash.";
        System.out.println(txt);

    }
}
