package example1;

public class CurrentConditionDisplay {
    private float temp;
    private float humidity;
    private float pressure;

    public void update(final float temp, final float humidity, final float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("currentConditionDisplay:\n" + "Temperature" + temp + "F degree" + "\n" +
                "Humidity" + humidity + "%" + "\n" + "pressure" + pressure + "\n");
    }
}
