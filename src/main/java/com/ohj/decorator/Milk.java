package com.ohj.decorator;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(2);
    }
}
