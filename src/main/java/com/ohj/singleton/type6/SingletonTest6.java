package com.ohj.singleton.type6;

public class SingletonTest6 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}

enum Singleton {

    INSTANCE; //属性
    public void sayOK(){
        System.out.println("ok~");
    }
}
