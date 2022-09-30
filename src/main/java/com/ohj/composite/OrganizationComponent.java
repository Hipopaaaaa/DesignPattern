package com.ohj.composite;

public abstract class OrganizationComponent {
    private String name;
    private String des;

    public void add(OrganizationComponent organizationComponent){
        //默认实现
        //如果使用抽象方法，则叶子节点必须重写该方法，没多大意义
        throw  new UnsupportedOperationException(); //不支持操作异常
    }
    public void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //print方法，子类都需要实现
    public abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

}
