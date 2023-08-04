/**
 * <H2> DataTypesExample </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 04 of August, 2023; 14:53:46
 */

package io.github.drmanan.learn.java;

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



        // Non Primitive or user definedcx
    }
}
