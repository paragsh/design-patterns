package example1;

import org.junit.Test;

public class WeatherStationTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        System.out.println("First state:\n");
        weatherData.setMeasurement(80 ,30 ,42);
        System.out.println("Second state:\n");
        weatherData.setMeasurement(67 ,46 ,57);
    }
}
