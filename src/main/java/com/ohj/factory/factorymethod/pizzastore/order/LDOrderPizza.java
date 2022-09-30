package com.ohj.factory.factorymethod.pizzastore.order;

import com.ohj.factory.factorymethod.pizzastore.pizza.*;

//订购伦敦的pizza
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("greek")){
            pizza=new LDGreekPizza();
        }
        return pizza;
    }
}
