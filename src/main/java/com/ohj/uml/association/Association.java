package com.ohj.uml.association;

public class Association {
}

//双向一对一关系：
class Person{
    private IDCard idCard;
}
class IDCard{
    private Person person;
}