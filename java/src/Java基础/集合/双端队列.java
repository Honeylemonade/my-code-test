package Java基础.集合;

import java.util.*;

/**
 * 双端队列:
 *
 * @Author XvYanpeng
 * @Date 2020/3/20 11:25
 */
public class 双端队列 {
    /**
     * 1.添加元素
     * addFirst(E e)在数组前面添加元素
     * addLast(E e)在数组后面添加元素
     * offerFirst(E e) 在数组前面添加元素，并返回是否添加成功
     * offerLast(E e) 在数组后天添加元素，并返回是否添加成功
     * <p>
     * 2.删除元素
     * removeFirst()删除第一个元素，并返回删除元素的值,如果元素为null，将抛出异常
     * pollFirst()删除第一个元素，并返回删除元素的值，如果元素为null，将返回null
     * removeLast()删除最后一个元素，并返回删除元素的值，如果为null，将抛出异常
     * pollLast()删除最后一个元素，并返回删除元素的值，如果为null，将返回null
     * removeFirstOccurrence(Object o) 删除第一次出现的指定元素
     * removeLastOccurrence(Object o) 删除最后一次出现的指定元素
     * <p>
     * <p>
     * 3.获取元素
     * getFirst() 获取第一个元素,如果没有将抛出异常
     * getLast() 获取最后一个元素，如果没有将抛出异常
     * <p>
     * <p>
     * 4.队列操作
     * add(E e) 在队列尾部添加一个元素，失败（队列满）将抛出异常
     * remove() 删除队列中第一个元素，并返回该元素的值，如果元素为null，将抛出异常
     * <p>
     * offer(E e) 在队列尾部添加一个元素，并返回是否成功，不抛出异常
     * poll()  删除获取队列中第一个元素，并返回该元素的值,如果元素为null，将返回null(其实调用的是pollFirst())不抛出异常
     * <p>
     * element() 获取第一个元素，不出队，如果没有将抛出异常
     * peek() 获取第一个元素，如果返回null，不抛出异常
     * <p>
     * put(E e) 向队列添加元素，如果没有位置，则一直等待
     * take() 向队列取元素，如果没有元素，则一直等待
     * <p>
     * offer(E e，时间) 在队列添加一个元素，如果限定时间内仍然不能插入，则放弃，不抛出异常
     * poll(时间)  删除获取出队列中第一个元素，（有时间的）并返回该元素的值,如果元素为null，将返回null(其实调用的是pollFirst())不抛出异常
     * <p>
     * <p>
     * <p>
     * <p>
     * 5.栈操作
     * push(E e) 栈顶添加一个元素
     * pop(E e) 移除栈顶元素,如果栈顶没有元素将抛出异常
     * <p>
     * <p>
     * 6.其他
     * size() 获取队列中元素个数
     * isEmpty() 判断队列是否为空
     * iterator() 迭代器，从前向后迭代
     * descendingIterator() 迭代器，从后向前迭代
     * contain(Object o) 判断队列中是否存在该元素
     * toArray() 转成数组
     * clear() 清空队列
     * clone() 克隆(复制)一个新的队列
     *
     * @param args
     */
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.offer(2);
        deque.offer(2);
        deque.offer(2);
        deque.offer(2);
        deque.offer(2);
        deque.removeAll(deque);
        deque.offer(2);
    }
}
