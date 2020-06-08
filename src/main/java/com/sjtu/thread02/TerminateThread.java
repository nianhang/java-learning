package com.sjtu.thread02;

public class TerminateThread implements Runnable {

    //1、设置标识
    private boolean flag = true;

    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        int i = 0;
        //2、关联标识
        while (flag){
            System.out.println(name+"--->"+i++);
        }
    }
    //3、对外提供方法改变标识
    public void terminate(){
        this.flag = false;
    }

    public static void main(String[] args) {


        TerminateThread tt = new TerminateThread("梅西");

        new Thread(tt).start();

        for(int i =0;i<99;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 20){
                tt.terminate();
                System.out.println("tt game over");
            }
            System.out.println("main-->"+i);
        }




    }

}
