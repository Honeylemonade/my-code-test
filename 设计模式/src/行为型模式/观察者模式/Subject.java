package 行为型模式.观察者模式;

/**
 * Subject: 主题
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 9:49
 */
public interface Subject {
    public void registerOberserver(Observer o);

    public void removeOberserver(Observer o);

    /**
     * @Author XvYanpeng
     * @Description 通知观察者
     * @Date 2020/2/6 20:08
     */
    public void notifyObservers();
}
