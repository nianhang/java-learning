/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-01-04 22:48
 * @description：
 * 饿汉式：静态代码块
 *
 */

package com.sjtu.pattern.singleton.demo2;

public class Singleton {

    //1、私有构造方法
    private Singleton(){

    }

    //2、声明Singleton类型的变量
    private static Singleton singleton;

    //3、在静态代码块中赋值
    static {
        singleton = new Singleton();
    }
    //4、对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return singleton;
    }

}
