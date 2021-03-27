package Java并发.创建线程;

import java.util.concurrent.FutureTask;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/3/27 17:48
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //继承
        ExThread exThread = new ExThread();
        exThread.start();

        //runnable接口
        MyTestThread myTestThread = new MyTestThread();
        Thread a = new Thread(myTestThread);
        a.start();

        //callable
        FutureTask<String> task = new FutureTask<String>(new MyCallable());
        new Thread(task).start();
        System.out.println(task.get());
    }
}
