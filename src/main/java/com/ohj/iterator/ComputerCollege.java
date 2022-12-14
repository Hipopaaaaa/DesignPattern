package com.ohj.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment=0; //保存当前数组的对象个数

    public ComputerCollege() {
        //初始化数据
        departments=new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departments[numOfDepartment]=department;
        numOfDepartment+=1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
