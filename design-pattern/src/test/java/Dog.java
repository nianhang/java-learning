/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2025-04-18 22:36
 * @description：
 */

public class Dog extends Animal{


    private String name = "Java";

    public void doEat(String str) {
        super.doEat();
    }


    @Override
    public void doEat() {
        eat();
    }

    private void eat(){
        System.out.println("=====狗eat=====");
    }
}
