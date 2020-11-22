package study.pattern.observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentlyConditionalDisplay currentlyConditionalDisplay = new CurrentlyConditionalDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(90,65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
