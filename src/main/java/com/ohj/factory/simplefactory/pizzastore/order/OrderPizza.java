package com.ohj.factory.simplefactory.pizzastore.order;

import com.ohj.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ohj.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ohj.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购披萨
public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;  //订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("芝士披萨");
//            } else {
//                break;
//            }
//
//            //输出pizza制作的过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }


    Pizza pizza=null;
    String orderType=""; //用户输入的
    public OrderPizza() {
        do{
            orderType=getType();

            pizza=SimpleFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败");
                break;
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
