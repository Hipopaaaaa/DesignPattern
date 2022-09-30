package com.ohj.decorator;

//具体的Decorator
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(3);
    }
}
