package Java并发.线程中断;

/**
 * MyTestThread:
 *
 * @Author XvYanpeng
 * @Date 2020/3/30 12:17
 */
public class MyTestThread implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Running......");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTestThread myTestThread = new MyTestThread();
        Thread a = new Thread(myTestThread);
        a.start();
        Thread.sleep(1000);
        a.interrupt();
    }
}
