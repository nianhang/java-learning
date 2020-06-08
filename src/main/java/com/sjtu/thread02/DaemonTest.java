package com.sjtu.thread02;

/**
 * 守护线程
 */
public class DaemonTest {

    public static void main(String[] args) {

        God god = new God();
        You you = new You();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        //new Thread(god).start();
        thread.start();
        new Thread(you).start();


    }

}
class You extends Thread{

    @Override
    public void run() {
        for(int i = 1;i<=365*100;i++){
            System.out.println("happy life");
        }
        System.out.println("ooooooo.....");
    }

}
class God extends Thread{
    @Override
    public void run() {
        for(;true;){
            System.out.println("bless you ...");
        }
    }
}