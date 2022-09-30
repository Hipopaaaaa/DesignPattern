package com.ohj.principle.liskov;

public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        System.out.println("==============================");

        B b = new B();
        System.out.println("11-3="+b.func1(11,3)); //本意是求出11-3
        System.out.println("1-8="+b.func1(1,8));
    }
}

//方式一：
//问题： 原理运行正常的相减功能发生了错误。原因就是B类无意中重写了父类的方法，造成原有功能出现错误

//在实际编程中，我们常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运行多台比较频繁的时候

//解决方案： 原来的父类A和子类B都继承一个更通俗的基类，原有的继承关系去掉，采用依赖、聚合、组合等关系代替



class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//B类继承了A类
//增加了一个新功能：完成两个数相加，然后和9求和
class B extends A {
    //无意间重写了A类的方法
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}