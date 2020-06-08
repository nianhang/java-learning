package com.sjtu.game1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @author linfengde
 * @date 2020/3/14 22:47
 */
public class GameUtil {

    private GameUtil(){
    }

    public static Image getImage(String path){

        BufferedImage bi = null;
        try {
            InputStream sourceimage = new BufferedInputStream(new FileInputStream(path));
            bi = ImageIO.read(sourceimage);
            //URL u = GameUtil.class.getClassLoader().getResource(path);
            //System.out.println(GameUtil.class.getResource(path));
            //URL u = GameUtil.class.getResource(path);
            //bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }


    public static void main(String[] args) {
       /* URL resource = GameUtil.class.getClassLoader().getResource("/");*/
        System.out.println(GameUtil.class.getResource("/"));
        System.out.println(GameUtil.class.getResource(""));


    }


}
