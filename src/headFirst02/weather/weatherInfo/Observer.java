package headFirst02.weather.weatherInfo;


/**
 * Created by wangjize on 2025/6/5.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
