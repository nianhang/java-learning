/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 13:57
 * @description：
 */

package com.sjtu.principles.demo2.before;

public class Square extends Rectangle {

    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }

}
