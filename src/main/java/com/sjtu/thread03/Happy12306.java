package com.sjtu.thread03;

public class Happy12306 {

    public static void main(String[] args) {
        Web12306 c = new Web12306(2,"happy sxt");
        new  Passenger(c,"老高",2).start();
        new  Passenger(c,"老裴",1).start();
    }


}

class Passenger extends Thread{
    int seats;

    public Passenger(Runnable target,String name,int seats) {
        super(target,name);
        this.seats = seats;
    }

}


class Web12306 implements Runnable{

    int available;
    String name;

    public Web12306(int available,String name){
        this.available = available;
        this.name = name;
    }

    @Override
    public void run() {

        Passenger passenger = (Passenger) Thread.currentThread();
        boolean flag = this.bookTickets(passenger.seats);
        if(flag){
            System.out.println("出票成功"+Thread.currentThread().getName()+"-<位置为:" + passenger.seats);
        }else {
            System.out.println("出票失败"+Thread.currentThread().getName()+"-<位置不够");
        }

    }

    public boolean bookTickets(int seats){
        System.out.println("可用位置为："+available);
        if(seats > available){
            return false;
        }
        available -= seats;
        return true;
    }



}
