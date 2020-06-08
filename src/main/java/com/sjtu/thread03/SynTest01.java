package com.sjtu.thread03;

public class SynTest01 {
    public static void main(String[] args) {
        SafeWeb12306 web12306 = new SafeWeb12306();
        System.out.println(Thread.currentThread().getName());

        new Thread(web12306,"码农").start();
        new Thread(web12306,"程序员").start();
        new Thread(web12306,"蚂蟥").start();
    }

}

//线程安全，同步
class SafeWeb12306 implements Runnable {

    private int ticketNums = 10;
    private boolean flag = true;

    public void run() {
        while (flag) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test();
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
}
