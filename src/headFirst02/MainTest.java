package headFirst02;


import headFirst02.weather.weatherInfoImpl.*;
import headFirst02.weatherUtil.weatherInfo2Impl.*;

/**
 * Created by wangjize on 2025/6/4.
 */

/*
 * 观察者模式
 * 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 */

public class MainTest {
    public static void observerPattern() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay("My", weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println("\n----------\n");

        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionsDisplay2 currentConditions2 = new CurrentConditionsDisplay2(weatherData2);
        StatisticsDisplay2 statisticsDisplay2 = new StatisticsDisplay2(weatherData2);
        ForecastDisplay2 forecastDisplay2 = new ForecastDisplay2(weatherData2);
        HeatIndexDisplay2 heatIndexDisplay2 = new HeatIndexDisplay2(weatherData2);

        weatherData2.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 70, 29.2f);
        weatherData2.setMeasurements(78, 90, 29.2f);
    }
}
