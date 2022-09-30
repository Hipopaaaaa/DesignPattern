package com.ohj.build;

public class Client {
    public static void main(String[] args) {
        //建普通房子
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        System.out.println("==============================");
        //建高楼
        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }
}
