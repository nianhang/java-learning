package com.sjtu.mymap;

public class MyHashMap {

    Node[] tables;
    int size;

    public MyHashMap(){
        tables = new Node[16];
    }

    public void put(Object key,Object value){
        Node newNode = new Node();
        newNode.hash = myHash(key.hashCode(),tables.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node temp = tables[newNode.hash];

        Node iterLast = null;
        boolean keyRepeat = false;
        if(temp == null){
            tables[newNode.hash] = newNode;
        }else {
            while (temp != null){
                if(temp.key.equals(key)){
                    temp.value = value;
                    keyRepeat = true;
                    break;
                }else {
                    iterLast = temp;
                    temp = temp.next;
                }
            }

            if(!keyRepeat){
                iterLast.next = newNode;
            }

        }


    }

    public int myHash(int v,int length){
        //System.out.println(v%(length-1));
        System.out.println(v&(length-1));
        return v&(length-1);
    }

    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(10,"aaa");
        myHashMap.put(20,"bbb");
        myHashMap.put(30,"ccc");
        myHashMap.put(26,"ssss");
        myHashMap.put(42,"hhhh");

       /* for(int i = 10;i<100;i++){
            System.out.print(i+"----");
            myHashMap.myHash(i,16);
        }*/

        System.out.println(myHashMap);



    }

}
