package Java并发.创建线程;

import java.util.concurrent.Callable;

/**
 * MyCallable:
 *
 * @Author XvYanpeng
 * @Date 2020/3/27 18:44
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String value = "Callable";
        Thread.sleep(5000);
        System.out.println("tash done");
        return value;
    }
}
