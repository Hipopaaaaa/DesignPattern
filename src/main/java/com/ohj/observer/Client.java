package com.ohj.observer;

public class Client {

    public static void main(String[] args) {
        //创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setDate(30,150,40);

        System.out.println("=====天气数据发生变化=====");
        weatherData.setDate(30,130,60);
    }
}
