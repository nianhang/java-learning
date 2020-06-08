package com.sjtu.mycollection;

public class MyArrayList01 {

    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList01(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList01(int capacity){
        elementData = new Object[capacity];
    }

    public void add(Object obj){
        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {

        MyArrayList01 myArrayList = new MyArrayList01();
        myArrayList.add("aa");
        myArrayList.add("bb");
        myArrayList.add("cc");
        System.out.println(myArrayList.toString());

    }


}
