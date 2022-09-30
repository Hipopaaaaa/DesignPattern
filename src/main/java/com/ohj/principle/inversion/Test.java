package com.ohj.principle.inversion;

public class Test {
}

////方式1：通过接口传递实现依赖
////开关的接口
//interface IOpenAndClose{
//    public void open(ITV itv);
//}
//interface ITV{ //ITV接口
//    public void play();
//}
////实现接口
//class OpenAndClose implements IOpenAndClose{
//    public void open(ITV itv) {  //接口传递体现在这
//        itv.play();  //至于这个play()方法的内容是什么，就要看哪个类实现类ITV接口
//    }
//}

////方式二：通过构造方法传递依赖
//interface IOpenAndClose{
//    public void open();
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV itv;
//
//    public OpenAndClose(ITV itv) {  //构造器依赖传递，体现在这
//        this.itv = itv;
//    }
//
//    public void open() {
//        this.itv.play();
//    }
//}

//方式三：通过setter方式传递依赖
interface IOpenAndClose{
    public void open();
    public void setTv(ITV itv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV itv;

    public void open() {
        this.itv.play();
    }

    public void setTv(ITV itv){  //setter依赖传递体现在这
        this.itv=itv;
    }
}

