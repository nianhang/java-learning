package com.sjtu.lesson08;

/**
 * @author linfengde
 * @date 2020/3/15 21:24
 */
public class TestAnonymousInnerClass {
    public static void test01(AA a){
        System.out.println("=========================");
        a.aa();
    }


    public static void main(String[] args) {

        TestAnonymousInnerClass.test01(new AA() {
            public void aa() {
                System.out.println("Test....");


            }
        });

    }
}

interface AA{
    void aa();
}

