/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:01
 * @description：静态内部类
 */

package com.sjtu.pattern.singleton.demo5;

public class Singleton {

    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
