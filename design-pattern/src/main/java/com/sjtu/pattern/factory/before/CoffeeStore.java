/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 14:53
 * @description：咖啡售賣店
 */

package com.sjtu.pattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee;

        if("American".equals(type)){
            coffee = new AmericanCoffee();
        }else if("Latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
