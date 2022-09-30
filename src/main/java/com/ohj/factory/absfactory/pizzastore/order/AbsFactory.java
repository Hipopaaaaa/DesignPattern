package com.ohj.factory.absfactory.pizzastore.order;

import com.ohj.factory.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    //让其实现类来实现该方法
    public Pizza createPizza(String orderType);
}
