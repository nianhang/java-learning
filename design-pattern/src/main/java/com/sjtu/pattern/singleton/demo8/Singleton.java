/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:38
 * @description：静态内部类
 */

package com.sjtu.pattern.singleton.demo8;

public class Singleton{

    private static boolean flag = false;

    private Singleton(){
        synchronized (Singleton.class){
            //判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常，
            // 如果是false的话，说明第一次访问
            if(flag){
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
