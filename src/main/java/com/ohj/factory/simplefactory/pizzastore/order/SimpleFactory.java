package com.ohj.factory.simplefactory.pizzastore.order;

import com.ohj.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ohj.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ohj.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {
    //根据orderType，返回对应的Pizza对象
    //简单工厂模式也叫静态工厂模式，只需要在createPizza(）方法前添加关键字static即可
    public static Pizza  createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        }// 若有新的Pizza种类，在这里修改即可
        return pizza;
    }
}
