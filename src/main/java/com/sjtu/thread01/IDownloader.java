package com.sjtu.thread01;

public class IDownloader implements Runnable {

    private String url;

    private String name;

    public IDownloader(String url, String name){
        this.url = url;
        this.name = name;
    }

    public void run() {
        WebDownloader wd = new WebDownloader();
        wd.downLoad(url,name);
        System.out.println(name);
    }

    public static void main(String[] args) {

        IDownloader td1 =new IDownloader("http://pic5.nipic.com/20091225/3192297_142432250809_2.jpg","mobike.jpg");
        IDownloader td2 =new IDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
        IDownloader td3 =new IDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","success.jpg");

        new Thread(td1).start();
        new Thread(td2).start();
        new Thread(td3).start();


    }



}
