/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 14:53
 * @description：咖啡售賣店
 */

package com.sjtu.pattern.factory.static_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) throws Exception {
//        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
//        Coffee coffee = simpleCoffeeFactory.CreateCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.CreateCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
