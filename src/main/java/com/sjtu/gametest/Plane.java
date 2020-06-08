package com.sjtu.gametest;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author linfengde
 * @date 2020/3/15 15:05
 */
public class Plane extends GameObject {

    boolean left, up, right, down;

    boolean live = true;

    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
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
            default:
                break;
        }
    }

    public void minusDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
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
            default:
                break;
        }
    }


    @Override
    public void drawMySelf(Graphics g) {

        if(live){
            super.drawMySelf(g);
            if (left) {
                x -= speed;
            }
            if (right) {
                x += speed;
            }
            if (up) {
                y -= speed;
            }
            if (down) {
                y += speed;
            }
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

}
