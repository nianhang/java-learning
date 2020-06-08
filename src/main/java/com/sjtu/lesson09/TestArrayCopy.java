package com.sjtu.lesson09;

/**
 * @author linfengde
 * @date 2020/3/19 23:24
 */
public class TestArrayCopy {

    public static void main(String[] args) {

        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];

        System.arraycopy(s1,2,s2,6,2);

        for(int i = 0;i<s2.length;i++){
            System.out.println(i+":"+s2[i]);
        }

    }



}
