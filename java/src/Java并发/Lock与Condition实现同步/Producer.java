package Java并发.Lock与Condition实现同步;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 18:51
 */
public class Producer implements Runnable {
    Lock lock;
    Storage storage;
    Condition isFull;
    Condition isEmpty;

    public Producer(Lock lock, Storage storage, Condition isFull, Condition isEmpty) {
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
                while (storage.curAmount >= storage.maxAmount) {
                    isFull.await();
                }
                storage.curAmount++;
                System.out.println("生产一个：当前产品个数:" + storage.curAmount);
                Thread.sleep(200);
                isEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
