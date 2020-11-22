package study.pattern.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temparature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temparature, float humidity, float pressure){
        this.temparature = temparature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemparature(){
        return temparature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

}
