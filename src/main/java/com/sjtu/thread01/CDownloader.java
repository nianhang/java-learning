package com.sjtu.thread01;

import java.util.concurrent.*;

public class CDownloader implements Callable<Boolean> {

    private String url;

    private String name;

    public CDownloader(String url, String name){
        this.url = url;
        this.name = name;
    }


    public Boolean call() throws Exception {
        WebDownloader wd = new WebDownloader();
        wd.downLoad(url,name);
        System.out.println(name);
        return true;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CDownloader cd1 =new CDownloader("http://pic5.nipic.com/20091225/3192297_142432250809_2.jpg","mobike.jpg");
        CDownloader cd2 =new CDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
        CDownloader cd3 =new CDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","success.jpg");

        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Boolean> result1 = service.submit(cd1);
        Future<Boolean> result2 = service.submit(cd2);
        Future<Boolean> result3 = service.submit(cd3);

        Boolean r1 = result1.get();
        Boolean r2 = result2.get();
        Boolean r3 = result3.get();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        service.shutdownNow();

    }
}
