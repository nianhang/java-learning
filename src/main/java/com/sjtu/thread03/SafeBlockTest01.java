package com.sjtu.thread03;

public class SafeBlockTest01 {

    public static void main(String[] args) {

        Account account = new Account(1000,"结婚礼金");
        SynDrawing you = new SynDrawing("可悲的你",account,80);
        SynDrawing wife = new SynDrawing("happy的她",account,90);
        you.start();
        wife.start();

    }

}

class SynDrawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;

    public SynDrawing(String name, Account account, int drawingMoney) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {

        test();

    }
    //目标锁定account对象
    public void test(){

        if(account.money <=0){
            return;
        }

        //同步块，目标更明确
        synchronized (account){
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
}


