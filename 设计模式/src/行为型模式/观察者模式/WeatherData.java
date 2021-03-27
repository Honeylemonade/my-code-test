package 行为型模式.观察者模式;

import java.util.ArrayList;

/**
 * WeatherData:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 9:54
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerOberserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeOberserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setDatas(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //一旦数据更新，则通知所有观察者
        notifyObservers();
    }
}
