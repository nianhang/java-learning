package com.sjtu.thread03;

public class SafeTest02 {

    public static void main(String[] args) {

        Account account = new Account(100,"结婚礼金");
        SafeDrawing you = new SafeDrawing("可悲的你",account,80);
        SafeDrawing wife = new SafeDrawing("happy的她",account,90);
        you.start();
        wife.start();

    }

}
class SafeDrawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;

    public SafeDrawing(String name, Account account, int drawingMoney) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {

        test();

    }
    //目标不对，锁定失败，这里不是锁this，应该锁定account对象
    public synchronized void test(){
        if(account.money -drawingMoney <0){
            return;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.money -= drawingMoney;
        packetTotal += drawingMoney;
        System.out.println(this.getName()+"-->账户余额为:"+account.money);
        System.out.println(this.getName()+"-->口袋的钱为:"+packetTotal);
    }
}


