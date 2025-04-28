/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:13
 * @description：
 */

package com.sjtu.pattern.singleton.demo6;

public class Client {

    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance);

    }


}
