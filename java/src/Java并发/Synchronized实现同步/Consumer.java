package Java并发.Synchronized实现同步;

/**
 * Consumer:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 19:06
 */
public class Consumer implements Runnable {
    /**
     * 临界锁资源
     */
    Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (storage) {
                    while (storage.curAmount <= 0) {
                        storage.wait();
                    }
                    storage.curAmount--;
                    System.out.println("消费一个：当前产品个数:" + storage.curAmount);
                    Thread.sleep(200);
                    storage.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
