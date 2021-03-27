package Java并发.Lock与Condition实现同步;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Consumer:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 19:06
 */
public class Consumer implements Runnable {
    Lock lock;
    Storage storage;
    Condition isFull;
    Condition isEmpty;

    public Consumer(Lock lock, Storage storage, Condition isFull, Condition isEmpty) {
        this.lock = lock;
        this.storage = storage;
        this.isFull = isFull;
        this.isEmpty = isEmpty;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                while (storage.curAmount <= 0) {
                    isEmpty.await();
                }
                storage.curAmount--;
                System.out.println("消费一个：当前产品个数:" + storage.curAmount);
                Thread.sleep(200);
                isFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
