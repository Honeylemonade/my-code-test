package Java并发.线程池阻塞队列;

import java.util.concurrent.SynchronousQueue;

/**
 * MySynchronizedQueue:
 *
 * @Author XvYanpeng
 * @Date 2020/4/30 10:41
 */
public class MySynchronizedQueue {
    public static void main(String[] args) {
        //同步队列，相当于容量为1的阻塞队列
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();

        //三个向队列中插入的线程
        new Thread(() -> {
            try {
                synchronousQueue.put(1);
                System.out.println("插入成功");
                synchronousQueue.put(1);
                System.out.println("插入成功");
                synchronousQueue.put(1);
                System.out.println("插入成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //三个向队列中插入的线程
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronousQueue.take();
                System.out.println("获取成功");
                synchronousQueue.take();
                System.out.println("获取成功");
                synchronousQueue.take();
                System.out.println("获取成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
