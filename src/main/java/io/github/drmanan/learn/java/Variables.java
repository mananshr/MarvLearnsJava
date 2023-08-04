/**
 * <H2> Variables </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 04 of August, 2023; 14:43:47
 */

package io.github.drmanan.learn.java;

public class Variables {

    // rules regarding names of variables
    // not discussing conventions at the moment
    public static void main(String[] args) {
        /*
        In Java, there are different types of variables, for example:
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

        We will cover them later while learning Data types.
        */

        // To create a variable that should store a number, look at the following example:
        int marks = 20;

        // Create a variable called name of type String and assign it the value "Marv":
        String name = "Marv"; // Definition

        // You can also declare a variable without assigning the value, and assign the value later:
        String student_class; // Declaration
        student_class = "12th A"; // assignment

        // If you don't want others (or yourself) to overwrite existing values, use the
        // final keyword (this will declare the variable as "final" or "constant",
        // which means unchangeable and read-only):

        final int pi = 3;

        int a;
        a = 12;

        // To combine both text and a variable, use the + character:
        System.out.println("a is " + a);
        System.out.println("studentStandard is " + student_class);
        // But remember, for numeric values, the + character works as a mathematical operator
        // We will see this later in Operators.
        System.out.println(4+3);

        // int 1num = 123; // Invalid name, can not start with number

        int _id = 1234354325; // Valid with _ underscore
        int _1num = 342354; // Again valid

        // To declare more than one variable of the same type, you can use a comma-separated list:
        int x = 5, y = 60, z = 500;
        System.out.println(x + y + z);

        // You can also assign the same value to multiple variables in one line:
        x = y = z = 50;
        System.out.println(x + y + z);
    }
}
