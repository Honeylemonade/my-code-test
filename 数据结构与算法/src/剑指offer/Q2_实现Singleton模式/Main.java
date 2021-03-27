package 剑指offer.Q2_实现Singleton模式;

/**
 * Main:
 *
 * @author XvYanPeng
 * @date 2019/8/28 18:27
 */
public class Main {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        instance.showMessage();
        instance2.showMessage();
        instance2.showMessage();
    }
}
