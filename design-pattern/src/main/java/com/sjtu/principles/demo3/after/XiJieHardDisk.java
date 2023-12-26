/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 16:24
 * @description：
 */

package com.sjtu.principles.demo3.after;

public class XiJieHardDisk implements HardDisk {

    public void save(String data){
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    public String get(){
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }

}
