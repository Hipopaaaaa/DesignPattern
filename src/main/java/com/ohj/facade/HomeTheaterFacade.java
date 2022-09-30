package com.ohj.facade;

//外观类
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight=TheaterLight.getInstance();
        this.popcorn=Popcorn.getInstance();
        this.stereo=Stereo.getInstance();
        this.projector=Projector.getInstance();
        this.screen=Screen.getInstance();
        this.dvdPlayer=DVDPlayer.getInstance();
    }

    //电影院操作分成四步
    public void ready(){
        //打开爆米花机，降下屏幕，打开立体声，打开投影仪，打开dvd，关闭灯光
        popcorn.on();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.off();
    }

    public void play(){
        //播放电影
        dvdPlayer.play();
    }
    public void pause(){
        //暂停
        dvdPlayer.pause();
    }
    public void end(){
        //关闭爆米花机，升上屏幕，关闭立体声，关闭投影仪，关闭dvd，关闭灯光
        popcorn.off();
        theaterLight.on();
        screen.up();
        projector.off();
        dvdPlayer.off();
        stereo.off();
    }
}
