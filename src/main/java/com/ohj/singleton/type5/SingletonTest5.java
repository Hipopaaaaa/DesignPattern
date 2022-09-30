package com.ohj.singleton.type5;

public class SingletonTest5 {
}

class Singleton{
    private static  Singleton instance;
    public Singleton() {}

    //写一个静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供一个静态的公有方法
    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}