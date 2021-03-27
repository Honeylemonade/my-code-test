package Java并发.JUC辅助类;

import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier:
 * 场景案例：集齐7颗龙珠，召唤神龙
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 15:07
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        //场景案例：集齐7颗龙珠，召唤神龙
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("召唤神龙！！！");
        });
        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "收集到了龙珠");
                    cyclicBarrier.await();
                    System.out.println("yes");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i + 1)).start();
        }
    }
}
