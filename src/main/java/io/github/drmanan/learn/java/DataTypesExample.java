/**
 * <H2> DataTypesExample </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 04 of August, 2023; 14:53:46
 */

package io.github.drmanan.learn.java;

import java.lang.Math;

import static java.lang.Math.pow;

public class DataTypesExample {
    public static void main(String[] args) {

        // Data Types

        int i = 5; // Number
        String s = "Sentence or (group of) word(s)"; // Group of words != sentence

        // Primitive
        // Pre defined in java
        /*
         * Primitive
         * |-- Non-Numeric
         *    |-- Boolean // boolean
         *    |-- Character // char
         * |-- Numeric
         *    |-- Fixed point numbers (Whole numbers)
         *         |-- Byte // byte
         *         |-- Short // short
         *         |-- Integer // int
         *         |-- Long // long
         *    |-- Floating point numbers (Fractional numbers)
         *         |-- Float // float
         *         |-- Double // double
         *
         * Even though there are many numeric types in Java, the most used for
         * numbers are int (for whole numbers) and double
         * (for floating point numbers).
         * However, we will describe them all as you continue.
         * */

        boolean b = true; // size: 1 byte // true or false
        b = false;

        System.out.println(b);

        char c = 'a'; // 2 bytes // any single character on the keyboard
        System.out.println(c);

        c = 'क'; // supports unicode
        System.out.println(c);

        // c = 'ab'; // only one character

        byte byt = 127; // size: 1 byte // 127 is max
        // byt = 128; // error
        System.out.println(byt);

        byt = -128; // min byte
        System.out.println(byt);

        short shortInt = 128; // size 2 byres
        System.out.println(shortInt);

        shortInt = 32767; // max
        System.out.println(shortInt);

        shortInt = -32768; // min
        System.out.println(shortInt);

        /*
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
        */

        shortInt = (short) 32768; // type casting // bits are shifted
        System.out.println(shortInt); // prints -32768

        // Always go low to high (widening), avoid high to low (narrowing) while type casting unless you are absolutely sure

        shortInt = (short) 40000;
        System.out.println(shortInt); // prints -25536 //

        /*
         * Some explanation
         *
         * 40000 - 32768 = 7232
         * 32768 - 7232 = 25536
         *
         * How exactly this works
         * (max) 32767 - 40000 = -7232
         * (min)-32768 - (-7232) = -25536
         *
         * We will not discuss bit/bitwise ops at this moment
         *
         */

        // This is the same for any primitive data types

        i = 10; // size 4 bytes
        System.out.println(i);

        i = (int) pow(2, 10);
        System.out.println(i);

        i = 2147483647; // max
        System.out.println(i);

        System.out.println(i + 1); // min

        long l = 9223372036854775807L; // size 8 bytes // max // L differs between long and integer
        System.out.println(l);
        System.out.println(l + 1); // min

        // Fractional numbers // Floating point

        float v = 3.14f; // size 4 bytes
        System.out.println(v);

        v = 3.14159265359f;
        System.out.println(v); // rounds off to 7 sig figs

        double vd = 3.14159265359; // size 8 bytes // no issues for giving alpha notation
        System.out.println(vd); // can go upto 15 sig figs

        vd = 3.14159265358979323846;
        System.out.println(vd); // 15 sig figs

        vd = 12345678901234567890d; // here d is required to differ from int
        System.out.println(vd); // shows scientific notation with power of 10 (represented by E) // 15 sig figs

        // Scientific Numbers
        // A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Non-Primitive or user defined:
        // Non-primitive types are created by the programmer and is not defined by Java.
        // Non-primitive data types are called reference types because they refer to objects.
        // We will discuss them later in much detail while doing OOPS.

    }
}
