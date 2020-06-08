package com.sjtu.thread03;

public class UnsafeTest01 {
    public static void main(String[] args) {
        UnsafeWeb12306 web12306 = new UnsafeWeb12306();
        System.out.println(Thread.currentThread().getName());

        new Thread(web12306,"码农").start();
        new Thread(web12306,"程序员").start();
        new Thread(web12306,"蚂蟥").start();
    }

}

class UnsafeWeb12306 implements Runnable {

    private int ticketNums = 10;
    private boolean flag = true;

    public void run() {
        while (flag) {
            test();
        }
    }

    public void test(){
        if (ticketNums < 0) {
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
