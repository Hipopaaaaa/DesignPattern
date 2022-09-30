package com.ohj.mediator;

public class Curtains extends Colleague{

    public Curtains(Mediator mediator, String name) {
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

    public void upCurtains(){
        System.out.println("拉起窗帘");
    }
}
