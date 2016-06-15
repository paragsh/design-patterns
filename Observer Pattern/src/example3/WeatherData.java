package example3;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(final Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged() {
        notifyObserver();
    }
}
