package Java并发.Lock与Condition实现同步;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 21:12
 */
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Lock lock = new ReentrantLock();

        Condition isFull = lock.newCondition();
        Condition isEmpty = lock.newCondition();

        Thread threadA = new Thread(new Consumer(lock, storage, isFull, isEmpty));
        Thread threadB = new Thread(new Producer(lock, storage, isFull, isEmpty));
        threadA.start();
        threadB.start();

    }
}
