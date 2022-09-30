package com.ohj.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作GreekPizza准备原材料");
    }
}
