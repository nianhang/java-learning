package com.sjtu.lesson10;

/**
 * @author linfengde
 * @date 2020/3/31 23:05
 */
public class TestWrappedClass {
    public static void main(String[] args) {

        Integer a = new Integer(3);
        Integer b = Integer.valueOf(30);

        int c = b.intValue();
        double d = b.doubleValue();

        Integer e = new Integer("9999");
        Integer f = Integer.parseInt("99999");



        System.out.println(f);
        System.out.println(Integer.MIN_VALUE);

    }


}
