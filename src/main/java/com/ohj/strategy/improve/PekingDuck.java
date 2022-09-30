package com.ohj.strategy.improve;



public class PekingDuck extends Duck {

    public PekingDuck() {
        super.setFlyBehavior(new BadFlyBehavior());
        super.setQuackBehavior(new GeGeQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

}
