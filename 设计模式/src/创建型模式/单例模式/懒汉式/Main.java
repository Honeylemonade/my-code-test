package 创建型模式.单例模式.懒汉式;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 10:43
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton4 singleton4 = Singleton4.INSTANCE;
                System.out.println(singleton4.hashCode());
                singleton4.show();
            }).start();
        }
    }
}
