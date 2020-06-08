package com.sjtu.thread01;

public class LambdaTest03 {


    public static void main(String[] args) {

        IInterest iInterest = (int a, int c) ->{
            System.out.println("lambda---"+(a+c));
            return a+c;
        };
        iInterest.lambda(10,20);

        iInterest = (a,c) ->{
            System.out.println("lambda---"+(a+c));
            return a+c;
        };
        iInterest.lambda(100,200);

        iInterest =(a,c) -> (a+c);


        System.out.println(iInterest.lambda(1000,2000));

        iInterest =(a,c)->100;

        System.out.println(iInterest.lambda(100,200));


    }
}

interface IInterest{
    int lambda(int a,int c);
}

class Interest implements IInterest {

    @Override
    public int lambda(int a, int c) {
        System.out.println("lambda---"+(a+c));
        return a+c;
    }
}
