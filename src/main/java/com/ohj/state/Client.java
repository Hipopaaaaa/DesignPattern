package com.ohj.state;

public class Client {
    public static void main(String[] args) {
        // 创建活动对象，奖品池有多少个奖品
        RaffleActivity activity = new RaffleActivity(30);
        // 我们连续抽三次奖
        for (int i = 0; i < 3000; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();

            
        }
    }
}
