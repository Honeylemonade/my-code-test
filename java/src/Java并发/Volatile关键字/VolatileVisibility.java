package Java并发.Volatile关键字;

/**
 * VolatileVisibility:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 15:55
 */
public class VolatileVisibility implements Runnable {
    public static volatile int value = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            value++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new VolatileVisibility());
        Thread thread2 = new Thread(new VolatileVisibility());
        thread.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println(value);

    }
}
