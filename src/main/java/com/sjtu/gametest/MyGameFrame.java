package com.sjtu.gametest;

import com.sjtu.game1.GameUtil;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author linfengde
 * @date 2020/3/15 12:36
 */
public class MyGameFrame extends Frame {

    Image planeImage = com.sjtu.game1.GameUtil.getImage("D:/workspace/java-learning/src/main/resources/images/plane.png");
    Image bgIamge = GameUtil.getImage("D:/workspace/java-learning/src/main/resources/images/bg.jpg");



    Plane plane = new Plane(planeImage,300,300);

    ArrayList<Shell> shellArrayList = new ArrayList<Shell>();

    Explode explode;


    Date startTime = new Date();

    Date endTime;

    Boolean firstTime = true;

    @Override
    public void paint(Graphics g) {

        Color c = g.getColor();
        Font font = g.getFont();

        g.drawImage(bgIamge,0,0,null);

        plane.drawMySelf(g);

        for(int i = 0;i<shellArrayList.size();i++){
            Shell shell = shellArrayList.get(i);
            shell.draw(g);

            Boolean isTouch = shell.getRect().intersects(plane.getRect());

            if(isTouch && firstTime){
                plane.live = false;
                firstTime = false;
                endTime = new Date();

                if(explode == null){
                    explode = new Explode(plane.x,plane.y);
                }
                explode.draw(g);


            }
        }

        if(!plane.live){
            if(endTime == null){
                endTime = new Date();
            }
            int time = (int) (endTime.getTime() - startTime.getTime())/1000;
            g.setColor(Color.white);
            Font f = new Font("宋体",Font.BOLD,30);
            g.setFont(f);
            g.drawString("时间 ："+time+" 秒",120,260);
            g.drawString("陈丽玲要好好努力哦",120,360);

        }

        g.setColor(c);
        g.setFont(font);

    }

    class PaintThread extends Thread{

        @Override
        public void run() {

            while (true){
                repaint();
                //System.out.println("重画窗口");

                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class KeyMonitor extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }

    public void launchFrame(){

        setTitle("飞机躲避炸弹游戏");
        setVisible(true);

        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(300,300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new PaintThread().start();
        addKeyListener(new KeyMonitor());

        for(int i = 0;i<Constant.SHELL_NO;i++){
            shellArrayList.add(new Shell());
        }
    }


    public static void main(String[] args) {

        MyGameFrame myGameFrame = new MyGameFrame();

        myGameFrame.launchFrame();
    }


    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

}
