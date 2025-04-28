/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 14:53
 * @description：咖啡售賣店
 */

package com.sjtu.pattern.factory.simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) throws Exception {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.CreateCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
