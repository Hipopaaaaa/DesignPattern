package com.ohj.observer.improve;

import com.ohj.observer.CurrentConditions;

import java.util.ArrayList;

//天气类
//包含最新的天气情况
//含有 观察者集合，使用ArrayList来进行管理
//当有数据更新时，就主动的调用ArrayList中对象的update方法
public class WeatherData implements Subject{
    // 温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;


    public WeatherData() {
        observers=new ArrayList<>();
    }

    //将最新的信息推送给 调用方
    public void dataChange(){
        notifyObservers();
    }

    //更新数
    public void setDate(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    //遍历所有的观察者，并进行通知
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(getTemperature(),getPressure(),getHumidity()));
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
