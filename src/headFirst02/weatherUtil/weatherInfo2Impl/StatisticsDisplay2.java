package headFirst02.weatherUtil.weatherInfo2Impl;


import headFirst02.weatherUtil.weatherInfo2.DisplayElement2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wangjize on 2025/6/13.
 */
public class StatisticsDisplay2 implements Observer, DisplayElement2 {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay2(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData2) {
            WeatherData2 weatherData = (WeatherData2)observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
