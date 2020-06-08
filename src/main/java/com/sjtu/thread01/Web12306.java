package com.sjtu.thread01;

public class Web12306 implements Runnable {

    private int ticketNums = 99;

    public void run() {
        while (true){
            if(ticketNums < 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }


    public static void main(String[] args) {

        Web12306 web12306 = new Web12306();
        System.out.println(Thread.currentThread().getName());

        new Thread(web12306,"码农").start();
        new Thread(web12306,"程序员").start();
        new Thread(web12306,"蚂蟥").start();

    }

}
