package com.ohj.mediator;

//具体的同事类
public class Alarm extends Colleague{



    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中的集合
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
}
