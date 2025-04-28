import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2025-04-18 22:37
 * @description：
 */

/*
  先父后子，先静态后普通，先成员变量/代码块后构造方法
 */
class Parent{

    static {System.out.println("父类静态代码块");}

    Parent(){ System.out.println("父类构造方法");}

    { System.out.println("父类普通代码块");}
}

class Child extends Parent{
    static {System.out.println("子类静态代码块");}

    { System.out.println("子类普通代码块");}

    Child(){ System.out.println("子类构造方法");}
}


public class Test {

    public static void main(String[] args) throws Exception {
//        Dog dog = new Dog();
//
//        Class<?> clazz = dog.getClass();
//
//        Field field = clazz.getDeclaredField("name");
//
//        field.setAccessible(true);
//
//        String name = (String) field.get(dog);
//
//        System.out.println("Name:"+name);
//
//        field.set(dog,"Reflection");
//        System.out.println("New name:" + field.get(dog));
//
//
//        Method method = clazz.getDeclaredMethod("eat");
//        method.setAccessible(true);
//
//        method.invoke(dog);

        new Child();
        new Child();

    }


}
