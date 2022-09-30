package com.ohj.command;

//遥控器，也就是调用者
public class RemoteController {

    //"开" 按钮的命令数组
    private Command[] onCommands;
    //"关" 按钮的命令数组
    private Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    //通过构造器，完成按钮的初始化
    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }

    //按下 "开"按钮
    public void onButtonWasPushed(int no){
        //找到按钮并调用对应的方法
        onCommands[no].execute();
        //记录这才的操作，用于撤销
        undoCommand=onCommands[no];
    }
    //按下 "关"按钮
    public void offButtonWasPushed(int no){
        //找到按钮并调用对应的方法
        offCommands[no].execute();
        //记录这才的操作，用于撤销
        undoCommand=offCommands[no];
    }

    //按下 "撤销"按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
