package Java并发.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TreadPoolDemo:
 *
 * @Author XvYanpeng
 * @Date 2020/4/2 7:22
 */
public class TreadPoolDemo {
    public static void main(String[] args) {
        //无界的线程池
        ExecutorService e1 = Executors.newCachedThreadPool();
        ExecutorService e2 = Executors.newFixedThreadPool(100);
        ExecutorService e3 = Executors.newSingleThreadExecutor();
        ExecutorService e4 = Executors.newScheduledThreadPool(10);

        //创建了1000个任务
        for (int i = 0; i < 1000; i++) {
            //分别使用e1，e2，e3,e4
            int finalI = i;
            e2.execute(() -> {
                try {
                    //do something......
                    System.out.println("do something:" + finalI);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
