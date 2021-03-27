package Java并发.AQS自定义Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * MyLock:
 *
 * @Author XvYanpeng
 * @Date 2020/4/28 17:06
 */
public class MyLock implements Lock {
    //自定义的独占锁
    static class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = -4178376352017976816L;

        //独占锁
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        //独占锁
        @Override
        protected boolean tryRelease(int arg) {
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        //判断是是否是独占锁。
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        Condition newCondition() {
            return new ConditionObject();
        }
    }

    private Sync sync;

    public MyLock() {
        sync = new Sync();
    }

    //加锁
    @Override
    public void lock() {
        sync.acquire(1);
    }

    //获取可中断锁
    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    //获取锁，可能失败
    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    //在time时间内不能获取锁则失败
    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(time));
    }

    //释放锁
    @Override
    public void unlock() {
        sync.release(1);
    }

    //Condition来实现阻塞唤醒机制
    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}
