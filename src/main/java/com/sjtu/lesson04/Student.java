package com.sjtu.lesson04;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linfengde
 * @date 2020/3/9 12:27
 */
@Data
@NoArgsConstructor

public class Student {

    int id;

    String name;

    int age;

    Computer computer;


    public void paly(){
        System.out.println("学生在玩");
    }


    public static void main(String[] args) {

        Student student = new Student();

        student.id = 1;
        student.name = "学生";
        student.age = 20;

        student.paly();

        Computer com = new Computer();
        com.brand = "联想";
        student.computer = com;
        //student.setComputer(com);

        student.paly();







    }


}
