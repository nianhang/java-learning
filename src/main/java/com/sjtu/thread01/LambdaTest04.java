package com.sjtu.thread01;

public class LambdaTest04 {

    public static void main(String[] args) {

        new Thread(()->{
            for(int i = 0;i<100;i++){
                System.out.println("test1111111");
            }
        }).start();


        new Thread(()-> System.out.println("test222222222")).start();

    }

}
