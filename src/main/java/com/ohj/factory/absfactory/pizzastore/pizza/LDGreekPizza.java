package com.ohj.factory.absfactory.pizzastore.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDGreekPizza");
        System.out.println("给制作 LDGreekPizza 准备原材料");
    }
}
