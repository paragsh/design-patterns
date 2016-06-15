package example2;

public class WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    public float getHumidity() {
        return humidity;
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged() {
        float temp = getTemp();
        float humidity = getHumidity();
        float pressure = getPressure();

        new CurrentConditionDisplay().update(temp, humidity, pressure);
        new StatisticsDisplay().update(temp, humidity, pressure);
        new ForecastDisplay().update(temp, humidity, pressure);
    }
}
