package com.ohj.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //创建代理对象,可以强转
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intercept方法，从而实现目标对象的调用
        proxyInstance.teach();
    }
}
