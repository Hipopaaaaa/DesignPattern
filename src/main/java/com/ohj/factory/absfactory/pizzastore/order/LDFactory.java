package com.ohj.factory.absfactory.pizzastore.order;

import com.ohj.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.ohj.factory.absfactory.pizzastore.pizza.LDGreekPizza;
import com.ohj.factory.absfactory.pizzastore.pizza.Pizza;


//伦敦工厂
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("cheek")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("greek")){
            pizza=new LDGreekPizza();
        }
        return pizza;
    }
}
