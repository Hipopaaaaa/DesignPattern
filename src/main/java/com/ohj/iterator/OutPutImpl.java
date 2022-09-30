package com.ohj.iterator;

import java.util.Iterator;
import java.util.List;

//用于输出
public class OutPutImpl {
    //学院集合
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //输出： 所有学院，包括院系
    public void printCollege(){
        //从colleges中取出所有学院,然后进行遍历
        colleges.forEach(college -> {
            System.out.println("========"+college.getName()+"========");
            printDepartment(college.createIterator());
        });
    }

    //输出: 学院输出院系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department= (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
