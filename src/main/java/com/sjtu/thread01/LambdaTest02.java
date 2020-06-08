package com.sjtu.thread01;

public class LambdaTest02 {


    static class Love2 implements ILove{

        @Override
        public void lambda(int a) {
            System.out.println("i like lambda -->"+ (a+2));
        }
    }

    public static void main(String[] args) {

        ILove love = new Love();
        love.lambda(100);

        love = new Love2();
        love.lambda(100);

        class Love3 implements ILove{

            @Override
            public void lambda(int a) {
                System.out.println("i like lambda -->"+ (a+3));
            }
        }

        love = new Love3();
        love.lambda(100);

        love = new ILove() {
            @Override
            public void lambda(int a) {
                System.out.println("i like lambda -->"+ (a+4));
            }
        };
        love.lambda(100);

        love = a->{
            System.out.println("i like lambda -->"+ (a+5));
        };
        love.lambda(100);

        love = a-> System.out.println("i like lambda -->"+ (a+6));

        love.lambda(100);


    }
}

interface ILove{
    void lambda(int a);
}
class Love implements ILove{

    @Override
    public void lambda(int a) {
        System.out.println("i like lambda -->"+a);
    }
}
