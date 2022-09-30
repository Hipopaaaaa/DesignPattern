package com.ohj.bridge;

//折叠式手机，继承抽象类Phone
public class FoldedPhone extends Phone{

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        System.out.println("折叠样式手机");
        super.open();
    }

    public void close(){
        System.out.println("折叠样式手机");
        super.close();
    }

    public void call(){
        System.out.println("折叠样式手机");
        super.call();
    }
}
