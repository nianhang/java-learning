package com.sjtu.collection;

public class StaticProxy {
    public static void main(String[] args) {

        new WeddingCompany(new You()).happyWedding();


    }
}

interface Marry{
    void happyWedding();
}

class You implements Marry{

    @Override
    public void happyWedding() {
        System.out.println("我结婚，我快乐。。。。");
    }
}

class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void happyWedding() {
        begin();
        this.target.happyWedding();
        after();
    }

    private void begin(){
        System.out.println("开始工作，好好工作");
    }

    private void after(){
        System.out.println("结束工作。。。");
    }
}

