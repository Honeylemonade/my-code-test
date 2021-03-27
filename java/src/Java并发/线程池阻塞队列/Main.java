package Java并发.线程池阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/30 10:26
 */
public class Main {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        //容量设置为3的ArrayBlockingQueue
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        System.out.println(arrayBlockingQueue.add(1));
        System.out.println(arrayBlockingQueue.add(2));
        System.out.println(arrayBlockingQueue.add(3));
    }

    public static void test2() {
        //容量设置为3的ArrayBlockingQueue
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        System.out.println(arrayBlockingQueue.add(1));
        System.out.println(arrayBlockingQueue.add(2));
        System.out.println(arrayBlockingQueue.add(3));
    }
}
