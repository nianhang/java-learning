package com.sjtu.lesson11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(df.format(new Date()));

        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date = df2.parse("1983-05-11 10:45:59");
        System.out.println(date);

        DateFormat df3 = new SimpleDateFormat("W");
        System.out.println(df3.format(new Date()));



    }


}
