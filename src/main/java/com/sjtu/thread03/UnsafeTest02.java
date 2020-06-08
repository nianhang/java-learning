package com.sjtu.thread03;

public class UnsafeTest02 {

    public static void main(String[] args) {

        Account account = new Account(100,"结婚礼金");
        Drawing you = new Drawing("可悲的你",account,80);
        Drawing wife = new Drawing("happy的她",account,90);
        you.start();
        wife.start();

    }

}

class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;

    public Drawing(String name, Account account, int drawingMoney) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {

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
