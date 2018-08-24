package headfirst.observer_pattern.three;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable obs;

    public ForecastDisplay(Observable obs) {
        this.obs = obs;
        obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(lastPressure + " forecast " + currentPressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
