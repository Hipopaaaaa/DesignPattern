package com.ohj.visitor;


//说明：
//1.这里使用到了双分派，即首先在客户端程序中，将具体的状态作为参数传递到了man中（第一次分派）
//2.然后man类调用作为参数的"具体方法"中的方法getManResult,同时将自己(this)作为参数
//  传入（完成第二次分派）

public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
