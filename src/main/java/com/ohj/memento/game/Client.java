package com.ohj.memento.game;

public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        //为游戏角色设置状态
        gameRole.setVit(100);
        gameRole.setDef(100);

        //保存当前状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("大战前状态");
        gameRole.display();

        System.out.println("大战后状态");
        gameRole.setVit(50);
        gameRole.setDef(50);
        gameRole.display();

        System.out.println("恢复");
        gameRole.recoverGameRole(caretaker.getMemento());
        gameRole.display();
    }
}
