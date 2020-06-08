package com.sjtu.thread01;

public class LambdaTest01 {

    static  class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("I like 2");
        }
    }

    public static void main(String[] args) {

        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("I like 3");
            }
        }

        like = new Like3();
        like.lambda();

        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like 4");
            }
        };
        like.lambda();

        like = ()-> System.out.println("I like 5");

        like.lambda();



    }
}


interface ILike{
    void lambda();
}

class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("I like 1");
    }
}