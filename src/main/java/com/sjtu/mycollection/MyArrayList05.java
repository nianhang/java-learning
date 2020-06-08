package com.sjtu.mycollection;

public class MyArrayList05<E> {

    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList05(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList05(int capacity){

        if(capacity < 0){
            throw new RuntimeException("初始化不能为负数");
        }else if(capacity == 0){
            elementData = new Object[DEFALT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }
    }

    public void add(E element){

        if(size == elementData.length){
            Object[] newElementData = new Object[elementData.length + (elementData.length >>1)];
            System.arraycopy(elementData,0,newElementData,0,elementData.length);
            elementData = newElementData;
        }

        elementData[size++] = element;
    }

    public E get(int index){
        if(checkRange(index)){
            throw new RuntimeException("传入的参数不在访问内");
        }
        return (E) elementData[index];
    }

    public void set(E element,int index){
        if(checkRange(index)){
            throw new RuntimeException("超出范围了");
        }
        elementData[index] = element;
    }

    public Boolean checkRange(int index){
        if(index < 0 || index > elementData.length-1){
            return true;
        }else {
            return false;
        }
    }

    public void remove(E element){

        for(int i =0;i<size;i++){
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }

    public void remove(int index){

        //a b c d e f
        //a b d e f null
        int numMoved = elementData.length - index - 1;
        if(numMoved > 0){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);

        }

        elementData[-- size] = null;

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

        MyArrayList05<String> myArrayList = new MyArrayList05<String>(10);

        for(int i =0;i<40;i++){
            myArrayList.add("lin"+i);

        }

        //myArrayList.set("test",20);
        //System.out.println(myArrayList.get(20));
        System.out.println(myArrayList.toString());

        myArrayList.remove(1);
        System.out.println(myArrayList.toString());

    }

}
