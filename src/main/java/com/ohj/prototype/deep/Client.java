package com.ohj.prototype.deep;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType dp = new DeepProtoType();
        dp.name="ohj";
        dp.deepCloneTarget=new DeepCloneTarget("大牛","小牛");

        //方式一完成深拷贝
        DeepProtoType dp2 = (DeepProtoType) dp.clone();

        //方式二完成深拷贝
        DeepProtoType dp3= (DeepProtoType) dp.deepClone();
        //结果发现dp.deepCloneTarget.hashCode()、dp2、dp3的结果不一致，即实现了深拷贝
        System.out.println("dp.name="+ dp.name+"  dp.deepCloneTarget="+dp.deepCloneTarget.hashCode());
        System.out.println("dp2.name="+ dp2.name+"  dp2.deepCloneTarget="+dp2.deepCloneTarget.hashCode());
        System.out.println("dp3.name="+ dp3.name+"  dp3.deepCloneTarget="+dp3.deepCloneTarget.hashCode());
    }
}
