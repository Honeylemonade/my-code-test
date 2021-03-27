package Java并发.syn实现生产者消费者;

/**
 * Storage: 增加，和减少应该是当前对象的操作，应该封装到当前对象中。
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 13:02
 */
public class Storage {
    int val = 0;
    private static final int MAX_VALUE = 10;

    public synchronized void increase() {
        try {
            //判断是否等待!!!注意一定要是while
            while (val >= MAX_VALUE) {
                this.wait();
            }
            //执行任务
            val++;
            System.out.println("生产者生产，当前数量为:" + val);
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void decrease() {
        try {
            //判断是否等待
            while (val <= 0) {
                this.wait();
            }
            //执行任务
            val--;
            System.out.println("消费者消费，当前数量为:" + val);
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
