/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 17:52
 * @description：懒汉式_线程不安全
 */

package com.sjtu.pattern.singleton.demo3;

public class Singleton {
    //1.私有构造函数
    private Singleton(){}

    //2.声明对象
    private static Singleton instance; //null

    //3.获取对象
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
