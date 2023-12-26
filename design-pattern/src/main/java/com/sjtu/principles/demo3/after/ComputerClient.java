/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 16:31
 * @description：
 */

package com.sjtu.principles.demo3.after;


public class ComputerClient {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new IntelCpu();
        HardDisk hardDisk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.run();

    }

}
