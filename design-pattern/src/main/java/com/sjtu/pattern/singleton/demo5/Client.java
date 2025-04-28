/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:05
 * @description：
 */

package com.sjtu.pattern.singleton.demo5;

public class Client {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }

}
