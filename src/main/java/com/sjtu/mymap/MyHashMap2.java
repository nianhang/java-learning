package com.sjtu.mymap;

public class MyHashMap2 {

    Node[] tables;
    int size;

    public MyHashMap2(){
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
            size++;
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
                size++;
            }

        }


    }

    public Object get(Object key){
        int hash = myHash(key.hashCode(),tables.length);
        Object value = tables[hash].value;

        if(value != null){
            Node temp = tables[hash];
            while(temp != null){
                if(temp.key.equals(key)){
                    value = temp.value;
                    break;
                }else {
                    temp = temp.next;
                }
            }
        }

        return value;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for(int i = 0;i<tables.length;i++){
            Node temp = tables[i];
            while (temp != null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }
        }
        int last = sb.lastIndexOf(",");
        StringBuilder replace = sb.replace(last,last+1,"}");


        return replace.toString();
    }

    public int myHash(int v, int length){
        //System.out.println(v%(length-1));
        //System.out.println(v&(length-1));
        return v&(length-1);
    }

    public static void main(String[] args) {

        MyHashMap2 myHashMap = new MyHashMap2();
        myHashMap.put(10,"aaa");
        myHashMap.put(20,"bbb");
        myHashMap.put(30,"ccc");
        myHashMap.put(26,"ssss");
        myHashMap.put(42,"hhhh");

       /* for(int i = 10;i<100;i++){
            System.out.print(i+"----");
            myHashMap.myHash(i,16);
        }*/

        //System.out.println(myHashMap.toString());
        System.out.println(myHashMap.get(26));



    }

}
