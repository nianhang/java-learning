package com.sjtu.lesson04;

import lombok.NoArgsConstructor;

/**
 * @author linfengde
 * @date 2020/3/9 22:38
 */
@NoArgsConstructor
public class Point {

    double x, y;
    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }
    public double getDistance(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}


class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);

        Point p1 = new Point();
        //System.out.println(p1.getDistance(origin));
        System.out.println(p.getDistance(origin));
    }
}
