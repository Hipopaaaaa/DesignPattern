package com.ohj.test;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    private University university;

    public OutPutImpl(University university) {
        this.university = university;
    }

    //输出：一个学院的全部
    public void printAll(){
        university.getColleges().forEach(college -> {
            System.out.println("========"+college.getName()+"=======");
            printDepartment(college.createIterator());
        });
    }

    //输出：一个学校的学院
    public void printCollege(){
        List<College> colleges = university.getColleges();
        colleges.forEach(college -> System.out.println(college.getName()));
    }

    //输出：一个学院的系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
