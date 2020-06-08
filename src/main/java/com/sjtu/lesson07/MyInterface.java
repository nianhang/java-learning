package com.sjtu.lesson07;

/**
 * @author linfengde
 * @date 2020/3/15 17:41
 */
public interface MyInterface {


    public static final int MAX_AGE = 100;

    public abstract void test();

     //static void test01();

}

class Myclass implements MyInterface{

    public void test() {

        System.out.println(MAX_AGE);
    }
}
