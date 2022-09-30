package com.ohj.factory.absfactory.pizzastore.order;

import com.ohj.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;


    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza=null;
        String orderType="";

        do {
            orderType=getType();
            //这个factory有可能是BJFactory，也有可能是LDFactory
            pizza=factory.createPizza(orderType);

            if(pizza!=null){
                //输出pizza制作的过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
            }
        }while (true);
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
