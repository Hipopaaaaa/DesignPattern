package com.ohj.facade;

public class Popcorn {

    private static  Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println(" popcorn off");
    }
    public void play(){
        System.out.println(" popcorn is playing");
    }

    public void pause(){
        System.out.println(" popcorn pause");
    }

}
