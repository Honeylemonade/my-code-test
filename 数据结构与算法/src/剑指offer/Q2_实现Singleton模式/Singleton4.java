package 剑指offer.Q2_实现Singleton模式;

/**
 * SingleObject:
 * 优点：可以用于多线程，代码简单，充分利用了JAVA的特性
 * 缺点：实例不是在调用getInstance（）时创建的，
 * 当用到Singleton4对象的任意静态方法时，实例对象就会被创建，
 * 提前创建，存在降低内存使用效率的问题
 *
 * @author XvYanPeng
 * @date 2019/8/28 18:44
 */
public class Singleton4 {
    //创建SingleObject的一个对象
    private static Singleton4 instance = new Singleton4();

    //让构造函数为private,这样类就不会被实例化
    private Singleton4() {
    }

    //获取唯一可用的对象
    public static Singleton4 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello");
    }

    public static void show() {
        System.out.println("实例被创建");
    }
}
