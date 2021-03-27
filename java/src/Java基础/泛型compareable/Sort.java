package Java基础.泛型compareable;

import java.util.ArrayList;

/**
 * Sort:
 *
 * @Author XvYanpeng
 * @Date 2020/4/5 16:52
 */
public class Sort {

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> arrayList) {
        T temp;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j).compareTo(arrayList.get(j + 1)) > 0) {
                    temp = arrayList.get(j);
                    arrayList.remove(j);
                    arrayList.add(j + 1, temp);
                }
            }
        }
    }
}
