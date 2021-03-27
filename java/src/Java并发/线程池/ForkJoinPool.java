package Java并发.线程池;

/**
 * ForkJoinPool:
 *
 * @Author XvYanpeng
 * @Date 2020/7/8 15:41
 */
public class ForkJoinPool {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.ForkJoinPool forkJoinPool = new java.util.concurrent.ForkJoinPool(2);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            forkJoinPool.execute(() -> {
                //do something......
                System.out.println("do something:" + finalI);
            });
        }
        Thread.sleep(100000);
    }
}
