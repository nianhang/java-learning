package com.sjtu.lesson06;

/**
 * @author linfengde
 * @date 2020/3/15 16:13
 */
public abstract class Animal {

    abstract public void shout();

    public void run(){
        System.out.println("跑啊跑！");
    }


}

class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("汪汪汪 ！！！！");
    }

    Integer i;
}