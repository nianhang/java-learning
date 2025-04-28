/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 14:26
 * @description：咖啡類
 */

package com.sjtu.pattern.factory.static_factory;

public abstract class Coffee {

    public abstract String getName();


    public void addMilk(){
        System.out.println("加奶");
    }


    public void addSugar(){
        System.out.println("加糖");
    }

}
