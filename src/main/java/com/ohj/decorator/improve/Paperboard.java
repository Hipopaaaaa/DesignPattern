package com.ohj.decorator.improve;

public class Paperboard extends Decorator{
    public Paperboard(ExpressDelivery expressDelivery) {
        super(expressDelivery);
        setDescription("Paperboard");
        setPrice(4);
    }
}
