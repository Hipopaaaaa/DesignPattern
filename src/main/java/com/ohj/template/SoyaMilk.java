package com.ohj.template;


//抽象类，表示豆浆
public abstract class SoyaMilk {

    //抽象方法，可以做成final，防止子类去覆盖
    public final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    //选材料
    public void select(){
        System.out.println("第一步：选择好的黄豆");
    }

    //添加不同的配料，抽象方法，子类具体实现
    public abstract void addCondiments();

    //浸泡
    public void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡");
    }

    //打磨
    public void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打磨");
    }

}
