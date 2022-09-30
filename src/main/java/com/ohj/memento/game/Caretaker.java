package com.ohj.memento.game;


import java.util.List;
import java.util.Map;

//守护者对象，保存游戏角色状态
public class Caretaker {

    //一个角色保存一次的状态
    private Memento memento;

    //一个角色保存多次状态
    //private List<Memento> mementos;

    //多个角色保存多次状态
    //private Map<String,List<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
