package Java并发.创建线程;

/**
 * ExThread:
 *
 * @Author XvYanpeng
 * @Date 2020/3/27 17:50
 */
public class ExThread extends Thread {
    @Override
    public void run() {
        System.out.println("这是使用继承创建的线程");
    }

}
