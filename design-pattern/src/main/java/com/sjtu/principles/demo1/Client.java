/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 13:14
 * @description：
 */

package com.sjtu.principles.demo1;

public class Client {

    public static void main(String[] args) {

        SougouInput sougouInput = new SougouInput();

        //DefaultSkin skin = new DefaultSkin();
        //HeimaSkin skin = new HeimaSkin();
        TongyiSkin skin = new TongyiSkin();
        sougouInput.setSkin(skin);

        sougouInput.display();

    }
}
