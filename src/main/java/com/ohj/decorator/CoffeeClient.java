package com.ohj.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CoffeeClient {
    public static void main(String[] args) {
        //装饰者模式下的订单： 2份chocolate + 1份milk的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("描述= "+order.getDescription());
        System.out.println("价格= "+order.cost());

        //2.加1份牛奶
        order=new Milk(order);
        System.out.println("描述= "+order.getDescription());
        System.out.println("价格= "+order.cost());

        //3.加1份巧克力
        order=new Chocolate(order);
        System.out.println("描述= "+order.getDescription());
        System.out.println("价格= "+order.cost());

        //4.加1份巧克力
        order=new Chocolate(order);
        System.out.println("描述= "+order.getDescription());
        System.out.println("价格= "+order.cost());


    }
}
