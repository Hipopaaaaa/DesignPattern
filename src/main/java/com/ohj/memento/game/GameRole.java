package com.ohj.memento.game;

public class GameRole {

    private int vit;
    private int def;

    //创建Memento，根据游戏角色当前的状态，得到一个Memento
    public Memento createMemento(){
        return new Memento(vit,def);
    }

    //从备忘录对象恢复游戏角色的状态
    public void recoverGameRole(Memento memento){
        this.vit=memento.getVit();
        this.def=memento.getDef();
    }

    //显示当前状态
    public void display(){
        System.out.println("游戏角色的攻击力："+this.vit+" 防御力："+this.def);
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
