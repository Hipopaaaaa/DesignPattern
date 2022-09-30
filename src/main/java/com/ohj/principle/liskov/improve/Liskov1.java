package com.ohj.principle.liskov.improve;

import javax.lang.model.element.VariableElement;

public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        System.out.println("==============================");

        B b = new B();
        //因为B类不再继承A类，因此调用这不会再认为func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3="+b.func1(11,3)); //这里本意是求出11+3
        System.out.println("1+8="+b.func1(1,8));


        //使用组合仍然可以使用A类相关方法
        System.out.println("11-3="+b.func3(11,3)); //这里本意是求出11-3
    }
}

//方式二：


//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写到这个类

}

class A extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//B类不再继承A类
//增加了一个新功能：完成两个数相加，然后和9求和
class B extends Base {
    //如果类B需要用到类A的方法，使用组合关系
    private A a =new A();
    //仍然想使用A类的方法
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
    //无意间重写了A类的方法
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}