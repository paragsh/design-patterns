package example1;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getHumidity() {
        return humidity;
    }

    public float getTemp() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged() {
        float humidity = getHumidity();
        float temperature = getTemp();
        float pressure = getPressure();

        new CurrentConditionDisplay().update(temperature, humidity, pressure);
        new StatisticsDisplay().update(temperature, humidity, pressure);
        new ForecastDisplay().update(temperature, humidity, pressure);
    }
}
