package Java并发.JUC辅助类;

import java.util.concurrent.Semaphore;

/**
 * SemaphoreDemo:
 * <p>
 * 假设有6个车。3个停车位
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 15:25
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    //pv操作，P的获取资源
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "抢到车位");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "离开停车位");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    //pv操作，V操作释放信号量
                    semaphore.release();
                }
            }, String.valueOf(i + 1)).start();
        }
    }
}
