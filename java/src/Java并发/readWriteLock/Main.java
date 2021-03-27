package Java并发.readWriteLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Main: demo 自定义一个缓存
 *
 * @Author XvYanpeng
 * @Date 2020/4/30 9:49
 */
public class Main {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        //5个写线程
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                myCache.put("key", 2);
            }, "写线程" + String.valueOf(i)).start();
        }

        //5个读线程
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                myCache.get("key");
            }, "读线程" + String.valueOf(i)).start();
        }
    }
}

class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();
    //声明读写锁
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    //写的过程
    public void put(String key, Object value) {
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName() + "正在写入");
        map.put(key, value);
        System.out.println(Thread.currentThread().getName() + "写入完成++++");
        readWriteLock.writeLock().unlock();
    }

    //读的过程（可以多个线程同时读，提高效率）
    public Object get(String key) {
        readWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName() + "正在读取");
        Object o = map.get(key);
        System.out.println(Thread.currentThread().getName() + "读取完成****");
        readWriteLock.readLock().unlock();
        return o;
    }
}
