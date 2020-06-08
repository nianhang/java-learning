package com.sjtu.thread01;

/**
 * 静态代理，用于日志监控等
 */
public class StaticProxy {

    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();

        //new Thread(线程对象).start();

    }

}
interface Marry{
    void happyMarry();
}

class You implements Marry{

    public void happyMarry() {
        System.out.println("you and 嫦娥终于奔月了....");
    }
}

class WeddingCompany implements Marry{

    private Marry target;
    public WeddingCompany(Marry target){
        this.target = target;
    }

    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    private void ready(){
        System.out.println("布置猪窝。。。。");
    }

    private void after(){
        System.out.println("闹玉兔。。。。");
    }


}
