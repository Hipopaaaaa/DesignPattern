package com.ohj.uml.implementation;

public class Implementation {
}

interface PersonService{
    public void delete(Integer id);
}
class PersonServiceBean implements PersonService{

    public void delete(Integer id) {}
}
