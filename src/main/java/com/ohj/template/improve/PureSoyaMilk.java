package com.ohj.template.improve;

//纯豆浆，不添加任何配料
public class PureSoyaMilk extends SoyaMilk{
    @Override
    public void addCondiments() {
        //空实现,即不添加配料
    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
