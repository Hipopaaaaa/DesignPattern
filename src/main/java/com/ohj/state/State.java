package com.ohj.state;

//抽象状态接口
public abstract interface State {

    //扣除积分
    public abstract void deductMoney();
    //是否抽中奖品
    public abstract boolean raffle();
    //发放奖品
    public abstract void dispensePrize();
}
