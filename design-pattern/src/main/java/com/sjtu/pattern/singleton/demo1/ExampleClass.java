/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-01-04 23:08
 * @description：
 */

package com.sjtu.pattern.singleton.demo1;

import java.lang.reflect.Constructor;

public class ExampleClass {

    private String message;

    // 私有构造方法
    private ExampleClass() {
        this.message = "Hello, Reflection!";
    }

    public void showMessage() {
        System.out.println(message);

    }

    public static void main(String[] args) {
        try {
            // 获取Class对象
            Class<?> clazz = Class.forName("ExampleClass");

            // 获取私有构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            // 取消访问权限检查
            constructor.setAccessible(true);

            // 通过构造方法创建实例
            Object instance = constructor.newInstance();

            // 强制转换为实际类型
            ExampleClass exampleObj = (ExampleClass) instance;

            // 调用对象的方法
            exampleObj.showMessage();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
