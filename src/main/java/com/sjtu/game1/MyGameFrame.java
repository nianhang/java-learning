package com.sjtu.game1;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author linfengde
 * @date 2020/3/14 22:24
 */
public class MyGameFrame extends Frame {

    Image planeImage = GameUtil.getImage("D:/workspace/java-learning/src/main/resources/images/plane.png");
    Image bgIamge = GameUtil.getImage("D:/workspace/java-learning/src/main/resources/images/bg.jpg");

    int planeX = 250,planeY=250;

    Plane plane = new Plane(planeImage,planeX,planeY);

    ArrayList<Shell> list = new ArrayList<Shell>();
    //Shell[] shells = new Shell[50];
    //Shell shell = new Shell();

    Explode explode;

    Date startTime = new Date();
    Date endTime;

    int period;


    /**
     * 画图的工具
     * @param g
     */
    @Override
    public void paint(Graphics g) {

        Color c = g.getColor();
        Font font = g.getFont();

        g.drawImage(bgIamge,0,0,null);

        plane.drawSelf(g);

        //画出所有的炮弹
        for(int i = 0; i<list.size();i++){
            list.get(i).draw(g);

            //碰撞检查
            boolean peng = list.get(i).getRect().intersects(plane.getRect());

            if(peng){
                plane.live = false;
                if(explode == null){
                    explode = new Explode(plane.x,plane.y);
                    endTime = new Date();
                    period = (int) (endTime.getTime() - startTime.getTime())/1000;
                }
                explode.draw(g);
                //System.out.println(" 相撞了 。。。。。。");
            }

            if(!plane.live){
                g.setColor(Color.red);
                Font f = new Font("宋体",Font.BOLD,30);
                g.setFont(f);
                g.drawString("游戏时间 ："+period+" 秒",(int)plane.x,(int)plane.y);
            }
        }

        g.setColor(c);
        g.setFont(font);
    }

    //反复的重画窗口
    class PaintThread extends Thread{

        @Override
        public void run(){

            while (true){
                //System.out.println("重画窗口");
                repaint();

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //定义键盘监听的内部类
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
           // System.out.println("按下："+e.getKeyCode());
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("抬起: "+e.getKeyCode());
            plane.minusDirection(e);
        }


    }


    /**
     * 初始化窗口
     */
    public void launchFrame(){
        this.setTitle("飞机大战坦克_Focus");
        this.setVisible(true);

        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        this.setLocation(300,300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //启动窗口重画线程
        new PaintThread().start();
        addKeyListener(new KeyMonitor());

        //初始化50个炮弹
        for(int i = 0;i< Constant.SHELL_NO;i++){
            list.add(new Shell());
        }



    }

    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();


    }

    //解决闪烁的问题
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }





}
