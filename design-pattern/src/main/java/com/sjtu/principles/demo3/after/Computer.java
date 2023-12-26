/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 16:41
 * @description：
 */

package com.sjtu.principles.demo3.after;

import com.sjtu.principles.demo3.before.IntelCpu;
import com.sjtu.principles.demo3.before.KingstonMemory;
import com.sjtu.principles.demo3.before.XiJieHardDisk;

public class Computer {

    private HardDisk hardDisk;

    private Cpu cpu;

    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();

    }
}
