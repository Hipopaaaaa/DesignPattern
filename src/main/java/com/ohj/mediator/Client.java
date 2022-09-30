package com.ohj.mediator;

public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建各种同事对象，并且加入到中介者对象的hashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        //让闹钟发出消息，然后执行了一系列的动作
        alarm.sendAlarm(0);
        alarm.sendAlarm(1);

        
    }
}
