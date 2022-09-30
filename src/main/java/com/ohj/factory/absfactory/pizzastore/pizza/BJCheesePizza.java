package com.ohj.factory.absfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("给制作 BJCheesePizza 准备原材料");
    }
}
