package com.sjtu.lesson04;

/**
 * @author linfengde
 * @date 2020/3/9 23:12
 */
public class TestThis {

    int a ,b ,c;

    TestThis(){
        System.out.println("正要初始化一个Hello对象");
    }

    TestThis(int a,int b){
        //TestThis(); //这样是无法调用构造方法的！
        //this();
        this.a = a;
        this.b = b;
        
    }

    TestThis(int a, int b, int c) {
        this(a, b); // 调用带参的构造方法，并且必须位于第一行！
        this.c = c;
    }

    void sing() {
    }
    void eat() {
        this.sing(); // 调用本类中的sing();
        System.out.println("你妈妈喊你回家吃饭！");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        System.out.println(hi.a);
        System.out.println(hi.b);
        System.out.println(hi.c);
        hi.eat();
    }


}
