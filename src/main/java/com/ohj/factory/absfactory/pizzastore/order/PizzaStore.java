package com.ohj.factory.absfactory.pizzastore.order;

public class PizzaStore {
    public static void main(String[] args) {
        //订购北京的披萨
        new OrderPizza(new BJFactory());

        //订购伦敦的披萨
        new OrderPizza(new LDFactory());
    }
}
