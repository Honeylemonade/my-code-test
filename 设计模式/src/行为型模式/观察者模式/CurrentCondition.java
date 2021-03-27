package 行为型模式.观察者模式;

/**
 * CurrentCondition:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 10:03
 */
public class CurrentCondition implements Observer {
    private String name;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentCondition(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        //更新后通知被更新
        System.out.println(this.name + "收到通知");
    }
}
