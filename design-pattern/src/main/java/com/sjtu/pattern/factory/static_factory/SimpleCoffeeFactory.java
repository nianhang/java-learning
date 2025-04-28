/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-11 17:14
 * @description：簡單工廠
 */

package com.sjtu.pattern.factory.static_factory;

public class SimpleCoffeeFactory {

    // 加了static就是静态工厂，没有加就是简单工厂
    public static Coffee CreateCoffee(String type) throws Exception {
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
