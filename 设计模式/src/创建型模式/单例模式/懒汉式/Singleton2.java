package 创建型模式.单例模式.懒汉式;

/**
 * Singleton2:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 10:31
 */
public class Singleton2 {

    private volatile static Singleton2 instance;

    public Singleton2() {
    }

    public static Singleton2 getInstance() {
        //如果为null，则加锁创建实例
        if (instance == null) {
            synchronized (Singleton.class) {
                //这一次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
