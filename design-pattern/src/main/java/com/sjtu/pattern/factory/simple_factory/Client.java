/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 14:57
 * @description：
 */

package com.sjtu.pattern.factory.simple_factory;

public class Client {

    public static void main(String[] args) throws Exception {

        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("American");
        System.out.println(coffee.getName());

    }


}
