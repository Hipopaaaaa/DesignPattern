package com.ohj.visitor;

import java.util.LinkedList;
import java.util.List;

//数据结构，管理了很多人（man、woman）
public class ObjectStructure {

    //维护了一个集合
    private List<Person> peoples=new LinkedList<>();

    //增加到list
    public void attach(Person p){
        peoples.add(p);
    }

    //移除
    public void detach(Person p){
        peoples.remove(p);
    }

    //显示测评情况
    public void display(Action action){
        peoples.forEach(p -> p.accept(action));
    }

}
