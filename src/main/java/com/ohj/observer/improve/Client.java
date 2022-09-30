package com.ohj.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        Baidu baidu = new Baidu();

        //注册
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);

        //测试
        System.out.println("通知各个注册的观察者");
        weatherData.setDate(10,100,20);
    }
}
