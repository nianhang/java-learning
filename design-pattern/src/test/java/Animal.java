/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2025-04-18 22:35
 * @description：
 */

public class Animal {

    private int age;
    private  void sleep(){
        System.out.println("=====动物sleep=====");
    }

    public void doSleep(){
        sleep();
    }

    private void eat(){
        System.out.println("=====动物eat=====");
    }


    public void doEat(){
        eat();
        System.out.println("*****动物eat*****");
    }

}
