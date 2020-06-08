package com.sjtu.thread02;

public class YieldDemo02 {

    public static void main(String[] args) {

        new Thread(()->{
            for(int i =0;i<100;i++){
                System.out.println(i+"-->lambda");
            }
        }).start();

        for(int i =1;i<100;i++){
            if(i%20 == 0){
                Thread.yield();
            }
            System.out.println(i+"--> main....");
        }

    }

}
