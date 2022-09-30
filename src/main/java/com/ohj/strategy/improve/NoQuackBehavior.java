package com.ohj.strategy.improve;

public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不能叫");
    }
}
