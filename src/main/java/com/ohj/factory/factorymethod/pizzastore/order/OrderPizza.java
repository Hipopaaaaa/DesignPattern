package com.ohj.factory.factorymethod.pizzastore.order;

import com.ohj.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//订购披萨
public  abstract class OrderPizza {

    Pizza pizza=null;
    String orderType=""; //用户输入的

    //定义一个抽象方法，决定pizza的种类，由其子类来决定
    abstract Pizza createPizza(String orderType);
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;  //订购披萨的类型
        do {
            orderType = getType();
            pizza=createPizza(orderType); //抽象方法，让子类去实现
            //输出pizza制作的过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
