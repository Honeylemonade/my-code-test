package 创建型模式.单例模式.懒汉式;

/**
 * Singleton:所谓 “ 懒汉式”
 * 就是说单例实例在第一次被使用时构建，
 * 而不是在JVM在加载这个类时就马上创建此唯一的单例实例。
 * <p>
 * 但是这种方式很明显是线程不安全的!!!!!!!
 * 如果多个线程同时访问getInstance()方法时就会出现问题。
 * 如果想要保证线程安全，一种比较常见的方式就是在getInstance()
 * 方法前加上synchronized关键字
 *
 * @author XvYanPeng
 * @date 2019/10/30 11:50
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    //没有加入synchronized关键字的版本是线程不安全的,但多线程下，这样效率比较低
    public static Singleton getInstance() {
        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
