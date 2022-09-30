package com.ohj.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


//电子邮件
class Email{
    public String getInfo(){
        return "电子邮件信息：bye";
    }
}

//完成Person接收信息的功能
//方式一：
//问题： 如果获取的对象是 微信，短信等等，则新增类，同时Person也要增加相应等接收方法
//解决方案： 引入一个抽象等接口IReceiver，表示接收者，这样Person类与接口发生依赖
//  因为Email，微信 等等都属于接收的范围，他们各自实现IReceiver接口就ok，这样就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}