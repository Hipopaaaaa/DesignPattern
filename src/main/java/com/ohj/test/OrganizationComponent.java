package com.ohj.test;

import java.util.Iterator;

public  abstract class OrganizationComponent {
    private String name;
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public OrganizationComponent() {
    }

    public String getName() {
        return this.name;
    }

    //添加
    public  void add(String name, String description){
        throw  new UnsupportedOperationException();
    }
    public  void remove(String name){
        throw new UnsupportedOperationException();
    }
    //返回一个迭代器
    public  Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
