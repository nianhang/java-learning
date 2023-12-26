/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 17:49
 * @description：
 */

package com.sjtu.principles.demo4.before;

public class HeimaSafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
