package example4;

import org.junit.Test;

public class WeatherStationTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setMeasurement(80 ,30 ,42);
        System.out.println("\n");
        weatherData.setMeasurement(67 ,46 ,57);
    }
}
