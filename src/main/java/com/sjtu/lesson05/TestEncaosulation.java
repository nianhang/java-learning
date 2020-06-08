package com.sjtu.lesson05;

/**
 * @author linfengde
 * @date 2020/3/12 23:11
 */
public class TestEncaosulation {

    public static void main(String[] args) {

        Human h = new Human();

       /* h.age = 13;*/
        Boy b = new Boy();
        b.sayAge();


    }

}
class Human{

    private int age;

    void sayAge(){
        System.out.println(age);
    }

}

class Boy extends Human{

    void sayHello(){
        System.out.println();
    }
}