package com.sjtu.lesson11;

import java.io.File;

public class TestFile {

    public static void main(String[] args) {

        File file = new File("d:\\a.txt");
        System.out.println(file);
        file.renameTo(new File("d:/bb.txt"));
        System.out.println(System.getProperty("user.dir"));
    }
}
