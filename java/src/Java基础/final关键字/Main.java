package Java基础.final关键字;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/7/5 20:18
 */
public class Main {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        new Thread(() -> {
            a.getAndIncrement();
            System.out.println(a.get());
        }).start();
    }
}
