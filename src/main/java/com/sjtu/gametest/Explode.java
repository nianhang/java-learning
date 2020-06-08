package com.sjtu.gametest;

import com.sjtu.game1.GameUtil;

import java.awt.*;

/**
 * 爆炸类
 * @author linfengde
 * @date 2020/3/15 1:26
 */
public class Explode {

    double x,y;

    static Image[] imgs = new Image[16];
    static {
        for(int i=0;i<16;i++){
            imgs[i] = GameUtil.getImage("D:/workspace/java-learning/src/main/resources/images/explode/e"+(i+1)+".gif");
            imgs[i].getWidth(null);
        }
    }

    int count;

    public void draw(Graphics g){
        if(count<=15){
            g.drawImage(imgs[count], (int)x, (int)y, null);
            count++;
        }
    }

    public Explode(double x, double y){
        this.x = x;
        this.y = y;
    }



}
