package com.ohj.strategy.improve;

public class Client {
    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.quack();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();

        
    }
}
