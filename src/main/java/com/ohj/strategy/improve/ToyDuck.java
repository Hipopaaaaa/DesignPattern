package com.ohj.strategy.improve;



public class ToyDuck extends Duck {

    public ToyDuck() {
        super.setFlyBehavior(new NoFlyBehavior());
        super.setQuackBehavior(new NoQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
