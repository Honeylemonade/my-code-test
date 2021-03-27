package Java基础.集合;

import java.util.ArrayList;

/**
 * MyArrayList:
 *
 * @Author XvYanpeng
 * @Date 2020/4/11 9:34
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(1, 2);
        System.out.println(arrayList.toString());
    }
}
