package com.ohj.decorator.improve;

public class Client {
    public static void main(String[] args) {
        ExpressDelivery chair = new Chair();
        System.out.println(chair.getDescription());
        System.out.println(chair.cost());

        chair=new Paperboard(chair);
        System.out.println(chair.getDescription());
        System.out.println(chair.cost());

        System.out.println("=========");
        chair=new Plank(chair);
        System.out.println(chair.getDescription());
        System.out.println(chair.cost());

        
    }
}
