package headfirst.observer_pattern.three;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(1, 1, 2);
        weatherData.setMeasurements(1, 1, 3);
    }
}
