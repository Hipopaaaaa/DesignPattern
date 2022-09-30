package com.ohj.decorator;

public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) { //组合
        this.drink = drink;
    }

    @Override
    public double cost() {
        //调料的价格 + 饮料的价格
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        //drink.getDescription() 输出被装饰者的信息
        return "调料："+super.getDescription()+
                ",调料价格："+super.getPrice()+"&&"+drink.getDescription();
    }
}
