package com.sjtu.lesson05;

import lombok.Data;

/**
 * @author linfengde
 * @date 2020/3/10 9:21
 */
public class TestExtends {
    public static void main(String[] args) {

        Student s = new Student("高淇",172,"Java");
        System.out.println(s.getName());
        s.rest();
        s.study();

    }


}
@Data
class Person{
    private String name;
    private int height;

    public Person(String name,int height){
        this.name = name;
        this.height = height;
    }

    public void rest(){
        System.out.println("休息一会");
    }
}

class Student extends Person{

    String major;

    public void study(){
        System.out.println("在尚学堂，学习Java");
    }

    public Student(String name,int height,String major) {
        //天然拥有父类的属性
        super(name,height);
       /* this.setName(name);
        this.setHeight(height);*/
        this.major = major;
    }




}