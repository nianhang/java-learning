package com.sjtu.lesson11;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        Date d = new Date(2000);

        System.out.println(d);

        System.out.println(d.getTime());

        Date d2 = new Date();
        System.out.println(d2.getTime());

        System.out.println(d2.after(d));



    }


}
