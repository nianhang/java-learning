package com.sjtu.mymap;

public class MyHashMap3<K,V> {

    Node1<K,V>[] tables;
    int size;

    public MyHashMap3(){
        tables = new Node1[16];
    }

    public void put(K key,V value){
        Node1<K,V> newNode = new Node1<K,V>();
        newNode.hash = myHash(key.hashCode(),tables.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node1<K,V> temp = tables[newNode.hash];

        Node1<K,V> iterLast = null;
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

    public Object get(K key){
        int hash = myHash(key.hashCode(),tables.length);
        V value = (V)tables[hash].value;

        if(value != null){
            Node1<K,V> temp = tables[hash];
            while(temp != null){
                if(temp.key.equals(key)){
                    value = (V)temp.value;
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
            Node1<K,V> temp = tables[i];
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

        MyHashMap3<Integer,String> myHashMap = new MyHashMap3();
        myHashMap.put(10,"aaa");
        myHashMap.put(20,"bbb");
        myHashMap.put(30,"ccc");
        myHashMap.put(26,"ssss");
        myHashMap.put(42,"hhhh");

       /* for(int i = 10;i<100;i++){
            System.out.print(i+"----");
            myHashMap.myHash(i,16);
        }*/

        System.out.println(myHashMap.toString());
        //System.out.println(myHashMap.get(26));



    }

}
