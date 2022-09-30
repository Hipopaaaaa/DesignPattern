package com.ohj.singleton.type3;

public class SingletonTest3 {
}

class Singleton{
    private static Singleton instance;

    public Singleton() {}


    public static  Singleton getInstance(){
        if(instance==null){
            //把线程同步，加入到判断语句中
            synchronized (Singleton.class){
                instance=new Singleton();
            }
        }
        return instance;
    }
}