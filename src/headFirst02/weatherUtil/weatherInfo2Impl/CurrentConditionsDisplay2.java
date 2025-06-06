package headFirst02.weatherUtil.weatherInfo2Impl;


import headFirst02.weatherUtil.weatherInfo2.DisplayElement2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wangjize on 2025/6/5.
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement2 {
    Observable observable;
    float temperature;
    float humidity;
    float pressure;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                this.temperature + "F degrees and " +
                this.humidity + "% humidity " +
                this.pressure + "f pressure"
        );
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData2) {
            WeatherData2 weatherDataNew = (WeatherData2) obs;
            this.temperature = weatherDataNew.getTemperature();
            this.humidity = weatherDataNew.getHumidity();
            this.pressure = weatherDataNew.getPressure();
            display();
        }
    }
}
