package com.ohj.build.improve;



public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //创建盖房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //盖房子，返回一个产品（房子）
        House house = houseDirector.constructHouse();
        System.out.println("============================================");
        //盖高楼
        HighHouse highHouse = new HighHouse();
        //重置指挥者
        houseDirector.setHouseBuilder(highHouse);
        //盖房子，返回一个产品（高楼）
        House house2 = houseDirector.constructHouse();
    }
}
