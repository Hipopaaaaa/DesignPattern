package com.ohj.test;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//新增的 用于验证扩展性
public class MusicCollege extends College{

    private List<Department> departments;

    public MusicCollege() {
        super("音乐学院", "音乐学院");
        departments=new Vector<>();
        add("弹钢琴的","躺钢琴的");
        add("吹笛子的","吹笛子的");
        add("吹葫芦丝的","吹葫芦丝的");

    }

    @Override
    public String getName() {
        return "音乐学院";
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
        return new MusciCollegeIterator(departments);
    }
}
