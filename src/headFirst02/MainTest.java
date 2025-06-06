package headFirst02;


import headFirst02.weather.weatherInfoImpl.CurrentConditionsDisplay;
import headFirst02.weather.weatherInfoImpl.WeatherData;
import headFirst02.weatherUtil.weatherInfo2Impl.CurrentConditionsDisplay2;
import headFirst02.weatherUtil.weatherInfo2Impl.WeatherData2;

/**
 * Created by wangjize on 2025/6/4.
 */

/*
 * 观察者模式
 * 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 */

public class MainTest {
    public static void observerPatten() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay1 = new CurrentConditionsDisplay("watch", weatherData);
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay("phone", weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 70, 29.2f);
        weatherData.setMeasurements(82, 60, 24.2f);

        weatherData.removeObserver(currentDisplay1);

        weatherData.setMeasurements(83, 55, 24.3f);

        WeatherData2 weatherDataNew = new WeatherData2();
        CurrentConditionsDisplay2 currentDisplayNew = new CurrentConditionsDisplay2(weatherDataNew);
        weatherDataNew.setMeasurements(80, 65, 30.4f);

    }
}
