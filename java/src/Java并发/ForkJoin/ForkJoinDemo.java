package Java并发.ForkJoin;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

/**
 * ForkJoinDemo:求和计算从1加到1w
 *
 * @Author XvYanpeng
 * @Date 2020/4/30 16:12
 */
public class ForkJoinDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add(i);
        }
        integerArrayList.parallelStream()
                .forEach(e -> {
                    System.out.println(Thread.currentThread());
                });
    }

}
