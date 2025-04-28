/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:38
 * @description：静态内部类
 */

package com.sjtu.pattern.singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * *下面是为了解决序列化反序列化破解单例模式
     * @return
     */
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }

}
