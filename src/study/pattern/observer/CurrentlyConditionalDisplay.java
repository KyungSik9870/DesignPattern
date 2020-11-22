package study.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentlyConditionalDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temparature;
    private float humidity;

    public CurrentlyConditionalDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temparature = weatherData.getTemparature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temparature + "F degrees and " + humidity + "% humidity");
    }
}
