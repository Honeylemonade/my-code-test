package Java并发.syn实现生产者消费者;

/**
 * main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 13:05
 */
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        //两个生产者
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                storage.increase();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                storage.increase();
            }
        }).start();

        //两个消费者
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                storage.decrease();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                storage.decrease();
            }
        }).start();
    }
}
