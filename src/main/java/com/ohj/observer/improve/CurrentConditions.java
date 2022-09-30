package com.ohj.observer.improve;

//显示当前天气情况，可以理解成是气象站的网站
public class CurrentConditions implements Observer{

    // 温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，由WeatherData来调用，因此可以看出是推送模式
    public void update(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("CurrentConditions Temperature: "+temperature);
        System.out.println("CurrentConditions Pressure: "+pressure);
        System.out.println("CurrentConditions Humidity: "+humidity);
    }
}
