/**
 * <H2> Operators </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 04 of August, 2023; 18:26:55
 */

package io.github.drmanan.learn.java;

public class Operators {

    /*
     * Types of Ops in Java
     *
     * Operators
     * |-- Arithmetic
     * |     +-- Additive
     * |     |   |-- Addition +
     * |     |   +-- Subtraction -
     * |     +-- Multiplicative
     * |         |-- Multiplication *
     * |         |-- Division /
     * |         +-- Modulus/Remainder %
     * |-- Logical
     * |     |-- AND &&
     * |     +-- OR ||
     * |-- Assignment
     * |     |-- Simple =
     * |     +-- Complex // Combination of others and simple assignment (=)
     * |         +-- [+=, -=, /=, *=, %=, &=, ^=, |=, <<=, >>=, >>>=, maybe so on ...]
     * |-- Shift (Bitshift)
     * |     +-- [<<, >>, >>>]
     * |-- Bitwise // very interesting // Less practical use
     * |     |-- AND &
     * |     |-- Exclusive OR ^
     * |     +-- Inclusive OR |
     * |-- Ternary
     * |     +-- ? :
     * |-- Relational
     * |     |-- Comparison
     * |     |   +-- [<, >, <=, >=, instanceof]
     * |     +-- Equality
     * |         +-- [==, !=]
     * +-- Unary
     *       |-- Prefix
     *       |   +-- [++expr, --expr, +expr, -expr, ~, !]
     *       +-- Postfix
     *           +-- [expr++, expr--]
     * */

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(12 % 5);

        boolean b1 = true;
        boolean b2 = false;

        // Logical AND
        System.out.println(b1 && b2); // true AND False -> False
        /*
         * AND
         * +-----------+-----------+--------+
         * | Variable1 | Variable2 | Result |
         * +-----------+-----------+--------+
         * | True      | True      | True   |
         * | True      | False     | False  |
         * | False     | True      | False  |
         * | False     | False     | False  |
         * +-----------+-----------+--------+
         * */

        // Logical OR
        System.out.println(b1 || b2); // true OR False -> True
        /*
         * AND
         * +-----------+-----------+--------+
         * | Variable1 | Variable2 | Result |
         * +-----------+-----------+--------+
         * | True      | True      | True   |
         * | True      | False     | True   |
         * | False     | True      | True   |
         * | False     | False     | False  |
         * +-----------+-----------+--------+
         * */

        // Simple Assignment

        a = 8;

        // Unary Ops
        // Very useful
        a++; // simply a = a + 1;
        System.out.println(a);
        // Used extensively as increment op

        a--;
        System.out.println(a);
        // Used extensively as decrement op

        // Similarly
        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);

        // But what is the difference?
        System.out.println(a++); // inc after exec
        System.out.println(a--);
        System.out.println(++a); // inc before exec
        System.out.println(--a);

        System.out.println(b1);
        System.out.println(!b1); // NOT op // Opposite

        // System.out.println(!a); // works only on booleans

        System.out.println(~a); // works on numbers // Compliment op // Works through bits // More later

        System.out.println(a + " " + b);

        // Comparisons // Relation
        System.out.println(a < b); // boolean output
        System.out.println(a > b);

        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);

        // Instance of // TBD in OOPS - inheritance

        // Complex assignment
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);

        // More on Logical ops
        a = 5;
        b = 3;
        int  c = 8, d = 5;

        // && operator
        System.out.println((a > b) && (c > d)); // (5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are true.
        System.out.println((a > b) && (c < d)); // (5 > 3) && (8 < 5) returns false because the expression (8 < 5) is false.

        // || operator
        System.out.println((a < b) || (c > d)); // (5 < 3) || (8 > 5) returns true because the expression (8 > 5) is true.
        System.out.println((a > b) || (c < d)); // (5 > 3) || (8 < 5) returns true because the expression (5 > 3) is true.
        System.out.println((a < b) || (c < d)); // (5 < 3) || (8 < 5) returns false because both (5 < 3) and (8 < 5) are false.

        // ! operator
        System.out.println(!(a == b)); // !(5 == 3) returns true because 5 == 3 is false.
        System.out.println(!(a > b)); // !(5 > 3) returns false because 5 > 3 is true.

        // BitWise: hehe!
        // Uncommon

        /*
        Bitwise complement Operation of 35
        35 = 00100011 (In Binary)

        ~ 00100011
          ________
          11011100  = 220 (In decimal)

          // Smaller Digit
          a = 5 = 0101 (In Binary)
          Bitwise Complement Operation of 5
          ~ 0101
            _____
            1010  = 10 (In decimal)
        */

        // bitwise not
        // int has 4 bytes hence
        // ~ 00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        a = 5;
        System.out.println(~a);

        // Bitwise OR\

        // Remember the tables in Logical ops

        /*
        5 = 0101 (In Binary)
        7 = 0111 (In Binary)

        Bitwise OR Operation of 5 and 7
           0101
         | 0111
         ________
           0111  = 7 (In decimal)

           Bitwise OR Operation of 5 and 6
           0101
         | 0110
         ________
           0111  = 7 (In decimal)

           1010     10
         | 0110     6
         ________
           1110     14
        */

        System.out.println(5|7);
        System.out.println(5|6);
        System.out.println(10|6);

        // Bitwise AND
        /*
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise AND Operation of 5 and 7
          0101
        & 0111
        ________
          0101  = 5 (In decimal)

        Bitwise AND Operation of 8 and 1
          1000
        & 0001
        ________
          0000  = 0 (In decimal)

        Bitwise AND Operation of 15 and 9
          1111
        & 1001
        ________
          1001  = 9 (In decimal)
        */

        System.out.println(5&7);
        System.out.println(8&1);
        System.out.println(15&9);

        // Bitwise XOR

        /*
        5 = 0101 (In Binary)
        7 = 0111 (In Binary)

        Bitwise XOR Operation of 4 and 2
          0100
        ^ 0010
        ________
          0110  = 6 (In decimal)

        Bitwise XOR Operation of 11 and 7
          1011
        ^ 0111
        ________
          1100  = 12 (In decimal)
        */

        System.out.println(5^7);
        System.out.println(4^2);
        System.out.println(11^7);

        // recap from yesterday

        a = 5;
        b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

    }
}
