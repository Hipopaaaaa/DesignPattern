package com.ohj.composite;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;

//University 就是 Composite ，可以管理College
public class University extends OrganizationComponent{

    //存放的是College
    List<OrganizationComponent> list=new ArrayList();

    public University(String name, String des) {
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
