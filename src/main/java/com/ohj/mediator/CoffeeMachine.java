package com.ohj.mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //在创建同事对象时，将自己放入到ConcreteMediator对象中的集合
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }
    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者模式的getMessage()
        this.getMediator().getMessage(stateChange,this.getName());
    }

    public void startCoffee(){
        System.out.println("开始制作咖啡");
    }
    public void finishCoffee(){
        System.out.println("结束制作咖啡");
    }
}
