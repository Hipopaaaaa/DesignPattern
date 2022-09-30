package com.ohj.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("给制作 LDCheesePizza 准备原材料");
    }
}
