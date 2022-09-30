package com.ohj.build.improve;

import com.ohj.build.AbstractHouse;

//高楼类
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼在打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼在砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼在封顶");
    }
}
