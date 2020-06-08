package com.sjtu.game1;

/**
 * 游戏物体的父类
 * @author linfengde
 * @date 2020/3/14 23:51
 */

import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
public class GameObject {
    Image image;
    double x,y;
    int speed;
    int width,height;


    public void  drawSelf(Graphics g){
        g.drawImage(image,(int)x, (int)y,null);
    }

    public GameObject(Image image, double x, double y, int speed, int width, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image image, double x, double y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }

    /**
     * 返回物体所在的矩形，便于后期矩形的碰撞
     * @return
     */
    public Rectangle getRect(){
        return new Rectangle((int)x,(int)y,width,height);
    }

}
