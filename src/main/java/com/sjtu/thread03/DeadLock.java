package com.sjtu.thread03;

public class DeadLock {

    public static void main(String[] args) {
        Markup g1 = new Markup(1,"景甜");
        Markup g2 = new Markup(0,"王菲");
        g1.start();
        g2.start();

    }
}

class Lipstick{

}

class Mirror{

}

class Markup extends Thread{

    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;

    String girl;

    public Markup(int choice,String girl){
        this.choice = choice;
        this.girl = girl;
    }

    @Override
    public void run() {
        markup();
    }


    private void markup(){
        if(choice==0) {
            synchronized(lipstick) { //获得口红的锁
                System.out.println(this.girl+"涂口红");
                //1秒后想拥有镜子的锁
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

				/*synchronized(mirror) {
					System.out.println(this.girl+"照镜子");
				}*/
            }
            synchronized(mirror) {
                System.out.println(this.girl+"照镜子");
            }
        }else {
            synchronized(mirror) { //获得镜子的锁
                System.out.println(this.girl+"照镜子");
                //2秒后想拥有口红的锁
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                /*synchronized(lipstick) {
                    System.out.println(this.girl+"涂口红");
                }*/

            }
            synchronized(lipstick) {
                System.out.println(this.girl+"涂口红");
            }
        }
    }

}
