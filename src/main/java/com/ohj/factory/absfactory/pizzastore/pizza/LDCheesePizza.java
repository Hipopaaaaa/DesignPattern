package com.ohj.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("给制作 LDCheesePizza 准备原材料");
    }
}
