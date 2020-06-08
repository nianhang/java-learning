package com.sjtu.thread01;

import java.util.concurrent.*;

public class CRacer implements Callable<Integer> {

    private String winner;

    public Integer call() {
        for(int steps = 1;steps<100;steps++){
            if(Thread.currentThread().getName().equals("pool-1-thread-1")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            boolean flag = gameOver(steps);
            if(flag){
                return steps;
            }
        }
        return null;
    }

    private boolean gameOver(int steps){
        if(winner != null){
            return true;
        }else {
            if(steps == 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner==>"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CRacer cRacer = new CRacer();
        //创建执行服务:
        ExecutorService service = Executors.newFixedThreadPool(2);
        //提交执行:
        Future<Integer> result1 = service.submit(cRacer);
        Future<Integer> result2 = service.submit(cRacer);
        //获取结果:
        Integer r1 = result1.get();
        Integer r2 = result2.get();
        System.out.println(r1+"-->"+r2);
        //关闭服务:
        service.shutdownNow();

    }

}
