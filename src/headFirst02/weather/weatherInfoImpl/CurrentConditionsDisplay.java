package headFirst02.weather.weatherInfoImpl;


import headFirst02.weather.weatherInfo.DisplayElement;
import headFirst02.weather.weatherInfo.Observer;
import headFirst02.weather.weatherInfo.Subject;


/**
 * Created by wangjize on 2025/6/5.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String name;
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(String name, Subject weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println(
                this.name + " - Current Conditions :" +
                this.temperature + "F degrees and " +
                this.humidity + "% humidity " +
                this.pressure + "f pressure"
        );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void setWeatherData(Subject weatherData) {
        this.weatherData = weatherData;
    }

    public void setName(String name) {
        this.name = name;
    }
}
