package com.ohj.principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); //A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());
    }
}

interface Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}
class B implements Interface1,Interface2{

    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    public void operation3() {
        System.out.println("B 实现了operation3");
    }

}
class D implements Interface1,Interface3{

    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

class A{  //A 类通过Interface1，Interface2 依赖（使用）B类
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}
class C{  //C 类通过Interface1，Interface3 依赖（使用）D类
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}
