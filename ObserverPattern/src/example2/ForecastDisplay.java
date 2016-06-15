package example2;

public class ForecastDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void update(final float temp, final float humidity, final float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay:\n" + "Temperature" + temp + "F degree" + "\n" +
                "Humidity" + humidity + "%" + "\n" + "pressure" + pressure + "\n");
    }
}
