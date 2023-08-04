package io.github.drmanan.learn.java;

public class FirstCode {

    // Structure of code
    public static void main(String[] args)
    {
        // print a line of text to the screen
        System.out.println("Hello world!");
        //  text must be wrapped inside double quotations marks "".
        System.out.print("I am a Java Programmer. "); // no new line
        System.out.println("I love Java");
        // difference is that it does not insert a new line at the end of the output.
        System.out.print("I am learning it. ");
        System.out.println("It is awesome!");

        // unlike text, we don't put numbers inside double quotes
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        // can also perform mathematical calculations inside the println() method.
        System.out.println(3 + 3);
        System.out.println(2 * 5);

        // This is a comment.

        /* This is a multiline comment.
        * It can go into
        * multiple lines.*/
    }
}