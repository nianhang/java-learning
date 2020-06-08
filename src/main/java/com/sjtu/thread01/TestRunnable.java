package com.sjtu.thread01;

public class TestRunnable implements Runnable {


    public void run() {
        for(int i = 0;i<200;i++){
            System.out.println("一边唱歌。。。。。");
        }
    }

    public static void main(String[] args) {

        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();

        for(int i = 0;i<200;i++){
            System.out.println("一边coding。。。。。");
        }

    }



}
