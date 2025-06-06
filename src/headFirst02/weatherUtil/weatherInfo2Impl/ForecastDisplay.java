package headFirst02.weatherUtil.weatherInfo2Impl;


import headFirst02.weatherUtil.weatherInfo2.DisplayElement2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wangjize on 2025/6/5.
 */
public class ForecastDisplay implements Observer, DisplayElement2 {
    private float currentPressure = 29.9f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        // 实际显示的代码
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherDataNew = (WeatherData2) o;
            this.lastPressure = this.currentPressure;
            lastPressure = weatherDataNew.getPressure();
            display();
        }
    }
}
