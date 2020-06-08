package com.sjtu.thread03;


import java.util.concurrent.CopyOnWriteArrayList;

public class SynContainer {

    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        for(int i =0 ;i<1000;i++){
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(list.size());
    }

}
