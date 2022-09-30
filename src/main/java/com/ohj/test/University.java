package com.ohj.test;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University extends OrganizationComponent{

    private List<College> colleges;
    public University(String name,String description){
        super(name,description);
        colleges=new ArrayList<>();
    }

    @Override
    public String getName() {
        return super.getName();
    }


    public void add(College college) {
        colleges.add(college);
    }

    @Override
    public void remove(String name) {
        colleges.forEach(college -> {
            if(college.getName().equals(name)){
                colleges.remove(college);
            }
        });
    }

    @Override
    public Iterator createIterator() {
        return new UniversityIterator(colleges);
    }

    public List<College> getColleges() {
        return colleges;
    }
}
