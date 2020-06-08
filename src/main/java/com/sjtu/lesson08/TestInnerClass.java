package com.sjtu.lesson08;

/**
 * @author linfengde
 * @date 2020/3/15 21:06
 */
public class TestInnerClass {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        inner.show();

    }

}


class Outer{

    private int age = 10;

    public void testOuter(){
        System.out.println("testOuter");
    }

    class Inner{

        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("外部类的成员变量age："+Outer.this.age);
            System.out.println("内部类的成员变量age："+this.age);
            System.out.println("局部变量age："+age);
        }


    }

}
