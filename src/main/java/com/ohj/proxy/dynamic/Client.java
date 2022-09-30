package com.ohj.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();

        //给目标对象创建代理对象,可以强转成ITeacherDao
        ITeacherDao  proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //结果：proxyInstance=class com.sun.proxy.$Proxy0  可以看出是内存中动态生成来代理对象
        System.out.println("proxyInstance="+proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
    }
}
