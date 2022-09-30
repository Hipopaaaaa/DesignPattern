package com.ohj.flyweight;

public class Client {

    public static void main(String[] args) {

        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("ohj"));

        //以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("张三"));

        //以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("李四"));

        System.out.println("网站的分类共="+webSiteFactory.getWebSiteCount());
    }
}
