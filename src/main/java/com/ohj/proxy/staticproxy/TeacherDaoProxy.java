package com.ohj.proxy.staticproxy;

//代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; //目标对象，通过接口来进行聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...");
        target.teach(); //代理的方法，在此方法前，可以进行增强功能
        System.out.println("代理介绍...");
    }
}
