package com.ohj.test;

import java.util.Iterator;
import java.util.List;

//新增的。用于验证扩展性
public class MusciCollegeIterator implements Iterator {

    private List<Department> departments;
    private int index=-1;

    public MusciCollegeIterator(List<Department> departments) {

        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index>=departments.size()-1){
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
