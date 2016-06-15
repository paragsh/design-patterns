package example2;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay:\n" + "Temperature" + temp + "F degree" + "\n" +
                "Humidity" + humidity + "%" + "\n" + "pressure" + pressure + "\n");
    }
}
