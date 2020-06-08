package com.sjtu.gametest;

import java.awt.*;

/**
 * @author linfengde
 * @date 2020/3/15 15:00
 */
public class GameObject {

    Image image;
    double x,y;
    int speed;
    int width,height;

    public void drawMySelf(Graphics g){
        g.drawImage(image,(int)x,(int)y,null);
    }

    public GameObject(Image image,double x,double y){
        this.image = image;
        this.x = x;
        this.y = y;
        if(image != null){
            this.width = image.getWidth(null);
            this.height = image.getHeight(null);
        }
    }

    public GameObject(Image image, double x, double y, int speed, int width,
                      int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(){
    }

    /**
     * 返回物体对应矩形区域，便于后续在碰撞检测中使用
     * @return
     */
    public Rectangle getRect(){
        return new Rectangle((int)x ,(int)y , width,height);
    }

}
