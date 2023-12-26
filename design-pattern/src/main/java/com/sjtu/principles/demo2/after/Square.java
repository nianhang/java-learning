/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 15:41
 * @description：
 */

package com.sjtu.principles.demo2.after;

public class Square implements Quadrilateral{

    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
