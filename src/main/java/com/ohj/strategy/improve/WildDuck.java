package com.ohj.strategy.improve;



public class WildDuck extends Duck {

    //传入策略对象
    public WildDuck() {
        super.setFlyBehavior(new GoodFlyBehavior());
        super.setQuackBehavior(new GaGaQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
