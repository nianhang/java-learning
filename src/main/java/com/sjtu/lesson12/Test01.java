package com.sjtu.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("d:/a.txt");
            char c1 = (char) reader.read();
            System.out.println(c1);
        } catch (FileNotFoundException e) {
            //e.toString();
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
