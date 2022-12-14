package com.ohj.memento.theory;

public class Originator {
    private String state; //状态信息


    //编写一个方法，可以保存一个状态对象Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //编写一个方法，可以得到原始对象的状态,且恢复状态
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
