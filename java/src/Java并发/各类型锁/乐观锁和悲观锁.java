package Java并发.各类型锁;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 乐观锁和悲观锁:
 *
 * @Author XvYanpeng
 * @Date 2020/4/15 9:36
 */
public class 乐观锁和悲观锁 {
    public static void main(String[] args) {
        //----------------------------------------------------------悲观锁--------------------------------------------------------------------------
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        //do something...
        reentrantLock.unlock();
        //-------------------------------------------------------cas乐观锁--------------------------------------------------------------------
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
}
