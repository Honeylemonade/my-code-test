package Java并发.创建线程;

/**
 * MyTestThread:
 *
 * @Author XvYanpeng
 * @Date 2020/3/27 17:51
 */
public class MyTestThread implements Runnable {
    @Override
    public void run() {
        System.out.println("这是使用接口创建的线程");
    }
}
