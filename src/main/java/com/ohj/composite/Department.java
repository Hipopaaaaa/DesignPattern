package com.ohj.composite;

//叶子节点，也就是最下层的结构
public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    //add,remove就不需要写类，因为是叶子节点

    @Override
    public void print() {
        System.out.println(getName());
    }
}
