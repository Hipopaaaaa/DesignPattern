package com.ohj.test;

import java.util.Iterator;
import java.util.List;

public class UniversityIterator implements Iterator {

    private List<College> colleges;
    private int index=-1;

    public UniversityIterator(List<College> colleges) {
        this.colleges = colleges;
    }

    @Override
    public boolean hasNext() {
        if(index>=colleges.size()-1){
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {

        return colleges.get(index);
    }
}
