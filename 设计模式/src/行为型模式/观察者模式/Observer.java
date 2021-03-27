package 行为型模式.观察者模式;

/**
 * Observer:观察者
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 9:50
 */
public interface Observer {
    /**
     * @Author XvYanpeng
     * @Description 被观察对象更新，观察者执行update操作
     * @Date 2020/2/6 20:09
     */
    public void update(float temp, float humidity, float pressure);
}
