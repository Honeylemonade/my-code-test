package Java并发.Synchronized实现同步;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 19:14
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //这种实现方法很差劲，看syn实现生产者消费者包。
        Storage storage = new Storage();
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        Thread.sleep(500);
        producerThread.start();
    }
}
