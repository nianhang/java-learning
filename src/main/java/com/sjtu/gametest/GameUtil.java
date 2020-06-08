package com.sjtu.gametest;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author linfengde
 * @date 2020/3/15 12:43
 */
@Data
@NoArgsConstructor
public class GameUtil {


    public static Image getImage(String path){

        BufferedImage bufferedImage = null;

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
            bufferedImage = ImageIO.read(bufferedInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }

}
