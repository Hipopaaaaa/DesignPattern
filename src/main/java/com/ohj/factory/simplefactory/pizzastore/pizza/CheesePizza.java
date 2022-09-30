package com.ohj.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作CheesePizza准备原材料");
    }
}
