package Java并发.AQS自定义Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/28 8:01
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.newCondition();
    }
}
