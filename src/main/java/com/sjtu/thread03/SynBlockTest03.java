package com.sjtu.thread03;

public class SynBlockTest03 {
    public static void main(String[] args) {
        SynWeb12306 web12306 = new SynWeb12306();
        System.out.println(Thread.currentThread().getName());

        new Thread(web12306,"码农").start();
        new Thread(web12306,"程序员").start();
        new Thread(web12306,"蚂蟥").start();
    }

}

class SynWeb12306 implements Runnable {

    private int ticketNums = 10;
    private boolean flag = true;

    public void run() {
        while (flag) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //test();
            //test2();
            //test3();
            //test4();
            test5();
        }
    }

    //SafeWeb12306类中的this的对象
    public synchronized void test(){
        if (ticketNums <= 0) {
            this.flag = false;
            return;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
    }

    //SafeWeb12306类中的this的对象
    public void test2(){
        synchronized (this){
            if (ticketNums <= 0) {
                this.flag = false;
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }

    //线程不安全，范围太小，锁不住
    public void test4(){
        synchronized (this) {
            if (ticketNums <= 0) {
                this.flag = false;
                return;
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
    }

    //线程安全：尽可能锁定合理的范围（不是指代码，指数据的完整性）
    //double checking
    public void test5(){
        if (ticketNums <= 0) { //考虑的是没票的情况
            this.flag = false;
            return;
        }
        synchronized (this) {
            if (ticketNums <= 0) { //考虑的最后一张票的情况
                this.flag = false;
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }


    //线程不安全，ticketNumber对象一直在变
    public void test3(){
        synchronized ((Integer)ticketNums){
            if (ticketNums <= 0) {
                this.flag = false;
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }

}
