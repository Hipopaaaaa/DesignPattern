package com.ohj.test;

import java.util.Iterator;

public class Department extends OrganizationComponent{

    public Department(String name, String description) {
        super(name,description);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        this.setName(name);
    }

    public String getDescription() {
        return this.getDescription();
    }

    public void setDescription(String description) {
       this.setDescription(description);
    }
}
