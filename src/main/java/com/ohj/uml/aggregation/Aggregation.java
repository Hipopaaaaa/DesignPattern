package com.ohj.uml.aggregation;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Aggregation {
}

class Computer{
    private Mouse mouse = new Mouse();
    private Moniter moniter = new Moniter();
}
class Mouse{}
class Moniter{}