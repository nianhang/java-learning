/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 13:12
 * @description：
 */

package com.sjtu.principles.demo1;

public class SougouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
