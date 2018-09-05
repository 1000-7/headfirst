package headfirst.observer.two;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(1, 1, 1);
        weatherData.setMeasurements(2, 3, 2);
    }
}
