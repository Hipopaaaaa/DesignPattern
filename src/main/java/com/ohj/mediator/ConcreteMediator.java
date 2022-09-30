package com.ohj.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{

    //集合，放入所有的同事对象
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueMap=new HashMap<>();
        interMap=new HashMap<>();
    }


    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);

        if(colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine",colleagueName);
        }else if(colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }else if(colleague instanceof Curtains){
            interMap.put("Curtains",colleagueName);
        }
    }

    //具体中介者的核心方法
    //根据得到的信息，完成对应任务
    //中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm){
            if(stateChange==0){
                 ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            }else if(stateChange==1){
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).finishCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        }else if(colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        }else if(colleagueMap.get(colleagueName) instanceof TV){
            //如果是TV发出的消息，就做什么任务，这里就不写了
            System.out.println("TV发出了任务");

        }else if(colleagueMap.get(colleagueName) instanceof Curtains){
            //如果是Curtains发出的消息，就做什么任务，这里就不写了
            System.out.println("Curtains发出了任务");
        }
    }

    @Override
    public void sendMessage() {

    }
}
