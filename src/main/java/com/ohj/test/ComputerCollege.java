package com.ohj.test;



import java.util.Arrays;
import java.util.Iterator;

public class ComputerCollege extends College{

    Department[] departments;
    int numOfDepartment=0; //保存当前数组的对象个数


    public ComputerCollege() {
        super("计算机学院","计算机学院");
        //初始化数据
        departments=new Department[5];
        add("java专业","java专业");
        add("PHP专业","PHP专业");
        add("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void add(String name, String description) {
        Department department = new Department(name, description);
        departments[numOfDepartment++]=department;

    }

    @Override
    public void remove(String name) {
        for (int i = 0; i < departments.length; i++) {
            if(departments[i].getName().equals(name)){
                //这里有bug
                for (int j=i;j<departments.length-i-1;j++){
                    departments[j]=departments[j+1];
                }
                numOfDepartment--;
                break;
            }
        }
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
