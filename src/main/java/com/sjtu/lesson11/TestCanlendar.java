package com.sjtu.lesson11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCanlendar {


    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
        int year = calendar.get(Calendar.YEAR);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(calendar);
        System.out.println(year);
        System.out.println(weekDay);

        Calendar calendar1 = new GregorianCalendar();
        System.out.println(calendar1);

        calendar1.add(Calendar.DATE,100);
        System.out.println(calendar1);

        Date d4 = calendar1.getTime();
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());

    }

}
