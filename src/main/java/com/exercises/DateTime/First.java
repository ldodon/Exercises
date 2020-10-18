package com.exercises.DateTime;
import java.util.Calendar;


//Get a day of the week of a specific date
public class First {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek);

    }
}
