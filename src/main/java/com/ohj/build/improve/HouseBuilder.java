package com.ohj.build.improve;

//抽象建造者--> builder
public abstract class HouseBuilder {
    private House house=new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造产品后，将产品返回
    public House bulid(){
        return house;
    }
}
