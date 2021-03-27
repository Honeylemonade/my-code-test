package Java并发.原子类;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.atomic.LongAdder;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/28 21:04
 */
public class Main {
    public static void main(String[] args) {
        //普通CAS
        AtomicInteger atomicInteger = new AtomicInteger(2020);
        atomicInteger.compareAndSet(2020, 2021);
        atomicInteger.compareAndSet(2020, 2021);
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger.get());

        //利用版本号解决ABA问题
        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(1, 1);
        atomicStampedReference.compareAndSet(1, 2, 1, 2);
    }
}
