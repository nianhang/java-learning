package com.sjtu.thread04;


/**
 *  协作模型:生产者消费者实现方式一:管程法
 *   借助缓冲区
 */
public class CoTest01 {
    public static void main(String[] args) {

        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }

}

class Productor extends Thread{

    SynContainer synContainer;
    public Productor(SynContainer synContainer){
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        //生产
        for(int i =0;i<100;i++){
            System.out.println("生产-->"+i+"个馒头");
            synContainer.push(new Steamedbun(i));
        }
    }
}
class Consumer extends Thread{

    SynContainer synContainer;

    public Consumer(SynContainer synContainer){
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        //消费
        for(int i =0;i<100;i++){
            System.out.println("消费-->"+synContainer.pop().id+"个馒头");
        }
    }
}

class SynContainer{

    Steamedbun[] steamedbuns = new Steamedbun[10];
    int count = 0;
    //存储 生产
    public synchronized void push(Steamedbun steamedbun){
        //何时能生产  容器存在空间
        //不能生产 只有等待
        if(count == steamedbuns.length){
            try {
                this.wait();   //线程阻塞  消费者通知生产解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //存在空间 可以生产
        steamedbuns[count] = steamedbun;
        count++;
        //存在数据了，可以通知消费了
        this.notifyAll();
    }
    //获取 消费
    public synchronized Steamedbun pop(){
        //何时消费 容器中是否存在数据
        //没有数据 只有等待
        if(count == 0){
            try {
                this.wait();  //线程阻塞  生产者通知消费解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;    //存在数据可以消费
        Steamedbun steamedbun = steamedbuns[count];
        this.notifyAll();  //存在空间了，可以唤醒对方生产了
        return steamedbun;
    }
}
//馒头
class Steamedbun{
    int id;
    public Steamedbun(int id){
        this.id = id;
    }
}
