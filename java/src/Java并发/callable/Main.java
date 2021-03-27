package Java并发.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 14:11
 */
public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new MyThread());
        new Thread(futureTask).start();
        //获取callable的返回值，要等待其结果返回，否则一直阻塞
        Integer result = (Integer) futureTask.get();
        System.out.println("线程执行的返回值为" + result);
    }
}

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("运行了！！！！");
        Thread.sleep(3000);
        System.out.println("运行结束");
        return 111;
    }
}
