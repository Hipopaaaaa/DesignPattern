package com.ohj.composite;

import java.util.ArrayList;
import java.util.List;

// College 也是 Composite，可以管理Department
public class College extends OrganizationComponent{

    //存放的是Department
    List<OrganizationComponent> list=new ArrayList();

    public College(String name, String des) {
        super(name, des);
    }

    //重写add
    @Override
    public void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    //重写remove
    @Override
    public void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

    //print方法，就是输出University包含的学院
    @Override
    public void print() {
        System.out.println("----------"+getName()+"-----------");
        //遍历organizationComponent
        list.forEach(OrganizationComponent::print);
    }

}
