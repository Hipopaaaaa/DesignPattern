package com.ohj.uml.dependence;

public class Dependence {
}


class PersonServiceBean{
    private PersonDao personDao;
    public void save(Person person){}
    public IDCard getIDCard(Integer personID){return null;}
    public void modify(){
        Departemt departemt = new Departemt();
    }
}


class PersonDao{}
class IDCard{}
class Person{}
class Departemt{}