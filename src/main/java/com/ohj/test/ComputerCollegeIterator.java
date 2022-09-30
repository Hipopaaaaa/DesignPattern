package com.ohj.test;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int index=0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(departments[index]==null||index>=departments.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }
}
