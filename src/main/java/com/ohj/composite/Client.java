package com.ohj.composite;

public class Client {
    public static void main(String[] args) {

        //从大到小创建对象,先创建学校
        OrganizationComponent university = new University("ohj大学", "顶级大学");

        //再创建学院
        OrganizationComponent college1 = new College("计算机学院", "最强学院");
        OrganizationComponent college2 = new College("美术学院", "还行学院");

        //创建各个学院下面的系
        college1.add(new Department("软件工程","很high的软件工程"));
        college1.add(new Department("网络工程","很high的网络工程"));
        college1.add(new Department("计算机科学与技术","很high的计算机科学与技术"));

        college2.add(new Department("美术设计","还不错"));
        college2.add(new Department("油画","还不错的油画"));

        //学院加入到学校
        university.add(college1);
        university.add(college2);

        //输出整个学校的信息
        university.print();

        System.out.println("=====================");

        //输出整个学院的信息
        college1.print();
    }
}
