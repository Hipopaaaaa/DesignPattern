package com.ohj.principle.segregation;

public class Segregation1 {
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class B implements Interface1{

    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}
class D implements Interface1{

    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    public void operation3() {
        System.out.println("D 实现了operation3");
    }

    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

class A{  //A 类通过Interface1 依赖（使用）B类
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}
class C{  //C 类通过Interface1 依赖（使用）D类
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}