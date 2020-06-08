package com.sjtu.mycollection;

public class MyArrayList03<E> {

    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList03(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList03(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E element){

        if(size == elementData.length){
            Object[] newElementData = new Object[elementData.length + (elementData.length >>1)];
            System.arraycopy(elementData,0,newElementData,0,elementData.length);
            elementData = newElementData;
        }

        elementData[size++] = element;
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

        MyArrayList03<String> myArrayList = new MyArrayList03<String>();
      /*  myArrayList.add("aa");
        myArrayList.add("bb");
        myArrayList.add("cc");
        System.out.println(myArrayList.toString());*/

        for(int i =0;i<40;i++){
            myArrayList.add("lin"+i);
        }

        System.out.println(myArrayList.toString());

    }

}
