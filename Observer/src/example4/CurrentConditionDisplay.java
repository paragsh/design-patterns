package example4;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(final Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(final Observable obs, final Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("currentConditionDisplay:" + temp + "F degree and " +humidity + "% humidity" + pressure + "pressure");
    }
}
