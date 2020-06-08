package com.sjtu.thread01;

public class LambdaThread {

    //静态内部类

    static class Test implements Runnable{
        public void run() {
            for(int i = 0;i<200;i++){
                System.out.println("一边唱歌。。。。。");
            }
        }
    }



    public static void main(String[] args) {


        //new Thread(new Test()).start();

        //局部内部类
        class Test2 implements Runnable{
            public void run() {
                for(int i = 0;i<200;i++){
                    System.out.println("一边唱歌。。。。。");
                }
            }
        }
        //new Thread(new Test2()).start();

        //匿名内部类，必须借助接口或者父类

      /* new Thread(new Runnable() {
            public void run() {
                for(int i = 0;i<200;i++){
                    System.out.println("一边唱歌。。。。。");
                }
            }
        }).start();*/

        //jdk8 lambda


       new Thread(()->{
          for(int i = 0;i<200;i++){
                    System.out.println("一边唱歌。。。。。");
                }
       }).start();


    }



}
