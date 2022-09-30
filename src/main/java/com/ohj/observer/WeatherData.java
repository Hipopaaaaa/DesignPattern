package com.ohj.observer;

//天气类
//包含最新的天气情况
//含有 CurrentConditios 对象
//当有数据更新时，就主动的调用CurrentConditios对象的update方法
public class WeatherData {
    // 温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    //将最新的信息推送给 调用方
    public void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    //更新数据
    public void setDate(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChange();
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
