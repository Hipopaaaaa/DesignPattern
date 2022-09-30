package com.ohj.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

//定义一个接口
interface IReceiver{
    public String getInfo();
}

//电子邮件
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：bye";
    }
}

//微信
class WeChat implements IReceiver{
    public String getInfo() {
        return "微信信息：bye";
    }
}
//完成Person接收信息的功能
//方式二：

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}