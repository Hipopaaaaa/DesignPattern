package com.ohj.iterator;

import java.util.Iterator;
import java.util.List;


public class InfoCollegeIterator implements Iterator {

    List<Department> departments; //信息工程学院是以list方式来存放
    int index=-1;//索引



    public InfoCollegeIterator(List<Department> departments) {
        this.departments=departments;
    }


    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index>=departments.size()-1){
            return false;
        }
        index+=1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
