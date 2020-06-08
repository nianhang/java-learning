package com.sjtu.game1;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 飞机类
 * @author linfengde
 * @date 2020/3/14 23:56
 */
public class Plane extends GameObject {

    //int speed = 3;
    boolean left,up,right,down;

    boolean live = true;

    public void  drawSelf(Graphics g){

        if(live){
            g.drawImage(image,(int)x, (int)y,null);
            //x++;
            if(left){
                x -=speed;
            }
            if(right){
                x +=speed;
            }
            if(up){
                y -=speed;
            }
            if(down){
                y +=speed;
            }
        }else {

            live = false;

        }

    }

    public Plane(Image image, double x, double y){
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = 3;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    //抬起某一个键，增加相应的方向
    public void addDirection(KeyEvent e){
        //System.out.println("=========");
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }

    //按下某一个键，取消相应的方向
    public void minusDirection(KeyEvent e){

        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }


}
