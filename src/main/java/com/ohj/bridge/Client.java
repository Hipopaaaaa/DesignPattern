package com.ohj.bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机（样式+品牌）
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("===============");
        FoldedPhone foldedPhone1 = new FoldedPhone(new Vivo());
        foldedPhone1.open();
        foldedPhone1.call();
        foldedPhone1.close();
    }
}
