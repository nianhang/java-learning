package com.sjtu.thread02;

public class BlockedJoin02 {

    public static void main(String[] args)  {

        System.out.println("爸爸和儿子买烟的故事");

        new Thread(new Father()).start();

    }

}

class Father extends Thread{

    public void run(){
        System.out.println("想抽烟，发现没有了");
        System.out.println("让儿子去买中华烟");

        Thread t = new Thread(new Son());
        t.start();
        try {
            t.join();
            System.out.println("老爸接过烟，开始抽起来");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("儿子丢了，老爸找儿子去了");
        }


    }
}

class Son extends Thread{

    public void run(){
        System.out.println("接过老爸的钱出去了");
        System.out.println("路边有个游戏厅，玩了10秒");
        for(int i =0;i<10;i++){
            System.out.println(i+"秒过去了。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("赶紧买烟去了");
        System.out.println("手拿一包烟，回去了");

    }

}