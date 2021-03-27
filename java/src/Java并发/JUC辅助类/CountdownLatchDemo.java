package Java并发.JUC辅助类;

import java.util.concurrent.CountDownLatch;

/**
 * CountdownLatchDemo:就是一个计数器，down是减法
 * 比如有这么一个场景：一个教室，里面有6个人，只有6个人全都出去之后，才能锁门。接下来为代码实现
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 14:57
 */
public class CountdownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "出门了");
                countDownLatch.countDown();
            }, String.valueOf(i + 1)).start();
        }
        //在没有变为0之前，一直阻塞
        countDownLatch.await();
        System.out.println("关门");
    }
}
