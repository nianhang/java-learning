/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 18:04
 * @description：
 */

package com.sjtu.pattern.singleton.demo4;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);


    }
}
