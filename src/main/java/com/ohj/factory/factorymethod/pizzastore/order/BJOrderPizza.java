package com.ohj.factory.factorymethod.pizzastore.order;

import com.ohj.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.ohj.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.ohj.factory.factorymethod.pizzastore.pizza.Pizza;

//订购北京的pizza
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("greek")){
            pizza=new BJGreekPizza();
        }
        return pizza;
    }
}
