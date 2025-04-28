/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-01-04 22:09
 * @description：
 * 恶汉式：静态成员变量
 */

package com.sjtu.pattern.singleton.demo1;

public class Singleton {

    //1、私有构造方法
    private Singleton(){
        if(singleton != null){
            throw new IllegalStateException("Already instantiated");
        }
    }
    //2、在本类成员变量中创建本类对象
    private static final Singleton singleton = new Singleton();

    //3、提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return singleton;
    }


}
