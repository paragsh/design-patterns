package example3;

import org.junit.Test;

public class WeatherStationTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);


        System.out.println("First state:\n");
        weatherData.setMeasurement(34 ,30 ,42);
        System.out.println("Second state:\n");
        weatherData.setMeasurement(67 ,46 ,57);
    }
}
