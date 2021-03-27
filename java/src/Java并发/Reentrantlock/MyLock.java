package Java并发.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * MyLock:
 *
 * @Author XvYanpeng
 * @Date 2020/4/2 12:05
 */
public class MyLock {
    public static void main(String[] args) {
        //默认是非公平锁
        ReentrantLock reentrantLock = new ReentrantLock();
        //参数为true则为公平锁
        ReentrantLock reentrantLock2 = new ReentrantLock(true);
    }
}
