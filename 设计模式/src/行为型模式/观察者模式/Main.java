package 行为型模式.观察者模式;

/**
 * Mian:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 10:05
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition a = new CurrentCondition("1号模板");
        CurrentCondition b = new CurrentCondition("2号模板");
        CurrentCondition c = new CurrentCondition("3号模板");
        weatherData.registerOberserver(a);
        weatherData.registerOberserver(b);
        weatherData.registerOberserver(c);
        weatherData.setDatas(1, 2, 3);
    }
}
