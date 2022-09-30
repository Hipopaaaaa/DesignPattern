package com.ohj.test;

import com.ohj.test.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege extends College{

    private List<Department> departments;

    public InfoCollege() {
        super("信息工程学院", "信息工程学院");
        //初始化数据
        departments=new ArrayList<>();
        add("信息安全专业","信息安全专业");
        add("网络安全专业","网络安全专业");
        add("服务器安全专业","服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void add(String name, String description) {
        Department department = new Department(name, description);
        departments.add(department);
    }

    @Override
    public void remove(String name) {
        for (Department department : departments) {
            if(department.getName().equals(name)){
                departments.remove(department);
                break;
            }
        }
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }


}
