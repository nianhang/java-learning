/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-06 23:51
 * @description：
 */

package com.sjtu.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

public class Client {

    public static void main(String[] args) throws Exception {
        //获取Singleton类的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton类的对象s1
        Singleton s1 = constructor.newInstance();
        Singleton s2 = constructor.newInstance();
        System.out.println(s1 == s2);
    }
}
