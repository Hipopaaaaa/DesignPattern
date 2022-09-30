package com.ohj.facade;

public class TheaterLight {

    private static final TheaterLight instance=new TheaterLight();
    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println(" TheaterLight  off");
    }
}
