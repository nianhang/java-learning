/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2024-04-07 0:16
 * @description：
 */

package com.sjtu.pattern.singleton.demo9;

import java.io.InputStream;

public class RuntimeDemo {

    public static void main(String[] args) throws Exception {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        //调用runtime的方法exec, 参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        //调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(arr);//返回读到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));

    }


}
