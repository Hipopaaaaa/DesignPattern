package com.ohj.build.improve;

//产品--->product
public class House {
    private String basic;
    private String walls;
    private String roofed;

    public House(String basic, String walls, String roofed) {
        this.basic = basic;
        this.walls = walls;
        this.roofed = roofed;
    }

    public House() {
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
