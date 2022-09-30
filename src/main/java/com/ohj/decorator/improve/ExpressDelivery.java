package com.ohj.decorator.improve;

public  abstract class ExpressDelivery {

    private String description;
    private double price;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
