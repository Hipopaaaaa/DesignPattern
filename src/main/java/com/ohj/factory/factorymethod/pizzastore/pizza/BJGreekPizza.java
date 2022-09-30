package com.ohj.factory.factorymethod.pizzastore.pizza;

public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJGreekPizza");
        System.out.println("给制作 BJGreekPizza 准备原材料");
    }
}
