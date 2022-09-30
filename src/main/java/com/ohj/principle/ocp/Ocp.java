package com.ohj.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//方式1：
//问题：当要新增一个画三角形功能时，GraphicEditor类需要做大量的修改，违反类ocp原则，即对扩展开发，对修改关闭
//改进方案： 把Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可
//      这样当有新的图形种类时，只需要让新的图形继承Shape，并实现draw方法即可，使用方的代码就不需要修改



//这是一个绘图的类[使用方]
class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type==1){
            drawRectangle(s);
        }else if(s.m_type==2){
            drawCircle(s);
        }
        //这里需要修改
        else if (s.m_type==3){
            drawTriangle(s);
        }
    }
    //绘制矩形
    public void drawRectangle(Shape r){
        System.out.println("绘制矩形");
    }
    //绘制圆形
    public void drawCircle(Shape r){
        System.out.println("绘制圆形");
    }
    //这里需要修改：绘制三角形
    public void drawTriangle(Shape r){
        System.out.println("绘制三角形");
    }
}

//Shape类，基类
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
//新增一个功能
class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}