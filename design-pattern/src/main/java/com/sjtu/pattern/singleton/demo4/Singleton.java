/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 18:01
 * @description：懒汉式（线程安全）
 */

package com.sjtu.pattern.singleton.demo4;

public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance;

    // 直接加锁
//    public  static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //双重检查
    public static Singleton getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null){
            synchronized (Singleton.class){
                //抢到锁之后再次判断是否为null
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }
}
