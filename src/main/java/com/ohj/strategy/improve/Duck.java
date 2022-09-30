package com.ohj.strategy.improve;

public abstract class Duck {

    //策略接口
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display(); //显示鸭子信息

    public void quack() {
        if(quackBehavior!=null){
            quackBehavior.quack();
        }
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
