package com.sjtu.lesson05;

/**
 * @author linfengde
 * @date 2020/3/12 23:37
 */
public class TestPolym {

    public static void main(String[] args) {
        Animal animal = new Animal();

        String string;

        //animalCry(animal);

        Dog d = new Dog();
        animalCry(d);


    }


    static void animalCry(Animal a) {
        a.shout();
    }
}

class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}