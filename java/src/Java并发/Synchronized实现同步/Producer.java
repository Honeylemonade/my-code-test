package Java并发.Synchronized实现同步;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 18:51
 */
public class Producer implements Runnable {
    /**
     * 临界锁资源
     */
    Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (storage) {
                    while (storage.curAmount >= storage.maxAmount) {
                        storage.wait();
                    }
                    storage.curAmount++;
                    System.out.println("生产一个：当前产品个数:" + storage.curAmount);
                    Thread.sleep(200);
                    storage.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
