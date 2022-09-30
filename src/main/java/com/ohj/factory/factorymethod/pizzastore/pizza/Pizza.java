package com.ohj.factory.factorymethod.pizzastore.pizza;

//将pizza做成抽象的
public abstract class Pizza {
    protected String name;

    //准备原材料，不同的披萨材料不一样，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 在烘烤");
    }

    public void cut() {
        System.out.println(name + " 在切割");
    }

    public void box() {
        System.out.println(name + "在包装");
    }

    public void setName(String name) {
        this.name = name;
    }
}
