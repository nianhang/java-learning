package com.sjtu.lesson12;

public class Test02 {
    public static void main(String[] args) throws IllegalAgeException {

        Person p = new Person(-1,"name");


    }


}

class Person {
    int age;
    String name;

    Person(int age,String name) throws IllegalAgeException {

        if(age < 0 ){
            throw new IllegalAgeException("年龄不能为负数。。。");
        }

    }



}

class IllegalAgeException extends Exception{
    public IllegalAgeException(){

    }

    public IllegalAgeException(String msg){
        super(msg);
    }

}
