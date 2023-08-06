/**
 * <H2> Conditionality </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Saturday, 05 of August, 2023; 19:27:53
 */

package io.github.drmanan.learn.java;

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Conditionality {
    public static void main(String[] args) {
        // Booleans
        // boolean data type can store true or false values.

        boolean isJavaFun = true;
        boolean isRawFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isRawFishTasty);   // Outputs false

        int x = 10;
        int y = 9;
        System.out.println(x > y);

        System.out.println(x == 10);

        int newEmployeeAge = 25;
        int votingAge = 18;
        System.out.println(newEmployeeAge >= votingAge);

        // Conditionality
        // If-Else
        // perform different actions depending on the result

        if (newEmployeeAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Booleans are the basis for all Java comparisons and conditions

        /*
        * Logical conditions from mathematics:
            -- Less than: a < b
            -- Less than or equal to: a <= b
            -- Greater than: a > b
            -- Greater than or equal to: a >= b
            -- Equal to a == b
            -- Not Equal to: a != b
        */

        if (x > y) {
            System.out.println("X is greater");
        } else {
            System.out.println("Y is greater");
        }

        // Use the else statement to specify a block of code to be executed if the condition is false.

        // before noon --> Good Morning
        // before 1600 hrs --> Good Afternoon
        // else --> Good Evening

        // helping point --> java.time.LocalTime.now()
        // Many ways to get current time
        // -- SimpleDateFormat
        // -- time.Clock
        // -- util.Date
        // -- sql.Date
        // -- Calendar <-- use this

        // Updated helping point
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar = GregorianCalendar.getInstance(); // Specific Calendar
        calendar.setTime(date);
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("currentHour: " + currentHour);

        if (currentHour < 12) {
            System.out.println("Good Morning");
        } else if (currentHour < 16) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        // Another way to get time // less code // Lib: JodaTime

        currentHour = new DateTime().getHourOfDay();
        System.out.println("JodaTime: " + currentHour);

        if (currentHour == new DateTime().getHourOfDay()) {
            System.out.println("Equals " + currentHour);
        }
    }
}
