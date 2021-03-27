package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Main:这个并不是完整的迭代器模式，而是使用了JDK自带的迭代器
 *
 * @Author XvYanpeng
 * @Date 2020/2/16 17:40
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
    }
}
