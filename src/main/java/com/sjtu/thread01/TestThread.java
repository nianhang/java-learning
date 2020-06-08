package com.sjtu.thread01;

public class TestThread extends Thread {


    @Override
    public void run() {
        for(int i = 0;i<200;i++){
            System.out.println("一边唱歌------");
        }
    }

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        testThread.start();

        for(int i = 0;i<200;i++){
            System.out.println("一边coding。。。。。");
        }



    }



}
