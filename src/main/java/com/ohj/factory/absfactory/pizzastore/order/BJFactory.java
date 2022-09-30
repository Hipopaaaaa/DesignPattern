package com.ohj.factory.absfactory.pizzastore.order;

import com.ohj.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.ohj.factory.absfactory.pizzastore.pizza.BJGreekPizza;
import com.ohj.factory.absfactory.pizzastore.pizza.Pizza;

//北京工厂
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza=new BJGreekPizza();
        }
        return pizza;
    }
}
