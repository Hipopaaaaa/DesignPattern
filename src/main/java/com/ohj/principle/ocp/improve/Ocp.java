package com.ohj.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//方式二：

//这是一个绘图的类[使用方]
class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        s.draw();
    }

}

//Shape类，基类
abstract class Shape{
    int m_type;
    public abstract void draw(); //抽象方法
}
class Rectangle extends Shape{

    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{

    public void draw() {
        System.out.println("绘制圆形");
    }
}
//新增一个功能
class Triangle extends Shape{

    public void draw() {
        System.out.println("绘制三角形");
    }
}