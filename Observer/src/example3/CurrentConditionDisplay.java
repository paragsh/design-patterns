package example3;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(final float temp, final float humidity, final float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay:\n" + "Temperature" + temp + "F degree" + "\n" +
                "Humidity" + humidity + "%" + "\n" + "pressure" + pressure + "\n");
    }
}
