package 创建型模式.单例模式.懒汉式;

/**
 * Singleton5:
 * 利用内部类解决了创建时机的问题，最优解
 * 由于静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以节省内存空间，并且保证其线程安全性
 *
 * @author XvYanPeng
 * @date 2019/8/28 19:01
 */
public class Singleton3 {
    //让构造函数为private,这样类就不会被实例化
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return InternalClass.getInstance();
    }

    public void showMessage() {
        System.out.println("hello");
    }

    /**
     * 内部类，解决提前创建实例的问题
     */
    static class InternalClass {
        private static Singleton3 instance = new Singleton3();

        public static Singleton3 getInstance() {
            return instance;
        }
    }
}
