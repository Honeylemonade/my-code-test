package Java并发.线程池;


import java.util.concurrent.*;

/**
 * 自定义线程池:
 *
 * @Author XvYanpeng
 * @Date 2020/7/8 15:25
 */
public class 自定义线程池 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                100,
                15000L,
                TimeUnit.MILLISECONDS,
                new SynchronousQueue<>());

        //创建了1000个任务
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            threadPoolExecutor.execute(() -> {
                //do something......
                System.out.println("do something:" + finalI);
            });
        }
    }
}
