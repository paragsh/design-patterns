package example4;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }


    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }
}
