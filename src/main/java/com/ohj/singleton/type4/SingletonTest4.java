package com.ohj.singleton.type4;

public class SingletonTest4 {
}

class Singleton{
    //加入关键字： volatile
    private static volatile Singleton instance;
    public Singleton() {}

    public static  Singleton getInstance(){
        //双重检查
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}