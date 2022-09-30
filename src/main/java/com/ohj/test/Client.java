package com.ohj.test;

public class Client {
    public static void main(String[] args) {
        //创建学校
        University university = new University("ohj大学", "ohj一手创办的大学");

        //创建学院
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        //往学校中添加学院
        university.add(computerCollege);
        university.add(infoCollege);

        //输出:
        OutPutImpl outPut = new OutPutImpl(university);
        System.out.println("=======输出全部信息========");
        outPut.printAll();

        System.out.println("=========输出"+university.getName()+"所有学院=======");
        outPut.printCollege();

        System.out.println("=======输出"+computerCollege.getName()+"的所有院系======");
        outPut.printDepartment(computerCollege.createIterator());

        System.out.println("=======输出"+infoCollege.getName()+"的所有院系======");
        outPut.printDepartment(infoCollege.createIterator());

        System.out.println("====删除某个院系后======");
        computerCollege.remove("java专业");
        infoCollege.remove("网络安全专业");
        computerCollege.remove("PHP专业");
        outPut.printAll();

        System.out.println("================新增了一个学院=============");
        MusicCollege musicCollege = new MusicCollege();
        university.add(musicCollege);
        outPut.printAll();

        System.out.println("=========音乐学院删除了一个院系后=========");
        musicCollege.remove("弹钢琴的");
        outPut.printAll();

    }
}
