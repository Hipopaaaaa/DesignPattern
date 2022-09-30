package com.ohj.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //创建学院
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        List<College> colleges = new ArrayList<>();
        colleges.add(computerCollege);
        colleges.add(infoCollege);

        //输出
        OutPutImpl outPut = new OutPutImpl(colleges);
        //输出学校的全部信息（包括学院+院系）
        outPut.printCollege();

        System.out.println("========="+computerCollege.getName()+"=========");
        //输出学院信息（院系）
        outPut.printDepartment(computerCollege.createIterator());
    }
}
