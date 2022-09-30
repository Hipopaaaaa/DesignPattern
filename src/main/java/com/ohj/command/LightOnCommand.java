package com.ohj.command;

public class LightOnCommand implements Command{

    //聚合LightReceiver
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者对方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //调用接收者对方法
        lightReceiver.off();
    }
}
