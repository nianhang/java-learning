/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 17:14
 * @description：簡單工廠
 */

package com.sjtu.pattern.factory.simple_factory;

public class SimpleCoffeeFactory {

    public Coffee CreateCoffee(String type) throws Exception {
       Coffee coffee = null;
       if("Amercian".equals(type)){
           coffee = new AmericanCoffee();
       }else if("Latte".equals(type)){
           coffee = new LatteCoffee();
       }else {
           throw new Exception("沒有其他咖啡");
       }
        return coffee;
    }


}
