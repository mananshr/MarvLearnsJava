/**
 * <H2> MathsExample </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Saturday, 05 of August, 2023; 18:56:44
 */

package io.github.drmanan.learn.java;

public class MathsExample {
    public static void main(String[] args) {
        int a = 16, b = 5;

        // Max
        System.out.println(Math.max(a, b));

        // Min
        System.out.println(Math.max(a, b));

        // Square root
        System.out.println(Math.sqrt(a));

        // Absolute value
        float negVal = -3.141f;
        System.out.println(Math.abs(negVal));

        // Random // Important
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());

        // andom number between 0 and 100
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber);

        double rand = Math.random();
        System.out.println("\n" + rand);

        randomNumber = (int) (rand * 100);
        System.out.println(randomNumber);

        // Math includes other common mathematical functions like trigonometric,
        // exponential, logarithmic, etc.

        // Remainder
        System.out.println(a % b);
        System.out.println(Math.IEEEremainder(a, b));

        a = (int) (Math.random() * 1000);
        b = (int) ((Math.random() + 1) * 100);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(a % b);
        System.out.println(Math.IEEEremainder(a, b));

        double x = (Math.random() * 1000);
        double y = ((Math.random() + 1) * 100);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println(x % y);
        System.out.println(Math.IEEEremainder(x, y));

        // Round
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));

        // Hypotenuse // Pythagoras
        a = 3;
        b = 4;
        System.out.println(Math.hypot(a, b));

        // Signum
        System.out.println(Math.signum(x));
        System.out.println(Math.signum(a));
        System.out.println(Math.signum(negVal));

        // Power of
        System.out.println("Powers of 2");
        double max_pow = 0;
        for (int i = 0; i < 20; i++) {
            max_pow = Math.pow(2, i);
            System.out.println(max_pow);
        }

        // sqrt
        System.out.println("\nRoots");
        while (Math.round(max_pow)>1){
            max_pow=Math.sqrt(max_pow);
            System.out.println(max_pow);
        }

        // Others are not very common.
    }
}
