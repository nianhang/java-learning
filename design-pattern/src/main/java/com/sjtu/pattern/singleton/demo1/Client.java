/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-01-04 22:47
 * @description：
 */

package com.sjtu.pattern.singleton.demo1;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
    }

}
