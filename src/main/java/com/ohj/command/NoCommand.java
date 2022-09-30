package com.ohj.command;

//没有任何命令，即空执行
//好处： 用于初始化每个按钮，当调用空命令时，对象什么都不做
//其实这算是一种设计模式，可以省略对空的判断
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
