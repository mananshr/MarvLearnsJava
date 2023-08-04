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

        boolean b = true; // size: 1 byte
        b = false;

        System.out.println(b);

        char c = 'a'; // 2 bytes
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

        shortInt = (short) 32768; // type casting // bits are shifted
        System.out.println(shortInt); // prints -32768

        // Always go low to high, avoid high to low while type casting unless you are absolutely sure

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

        // Non-Primitive or user defined: will discuss at a later stage

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

    }
}
