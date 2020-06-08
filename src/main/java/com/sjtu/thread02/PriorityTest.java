package com.sjtu.thread02;

public class PriorityTest {

    public static void main(String[] args) {

        //System.out.println(Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t1 = new Thread(myPriority,"test1");
        Thread t2 = new Thread(myPriority,"test2");
        Thread t3 = new Thread(myPriority,"test3");
        Thread t4 = new Thread(myPriority,"test4");
        Thread t5 = new Thread(myPriority,"test5");
        Thread t6 = new Thread(myPriority,"test6");
        Thread t7 = new Thread(myPriority,"test7");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);
        t7.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();



    }

}

class MyPriority implements Runnable{

    @Override
    public void run() {
        //Thread.yield();
        System.out.println(Thread.currentThread().getName() + "---->" + Thread.currentThread().getPriority());

    }
}
