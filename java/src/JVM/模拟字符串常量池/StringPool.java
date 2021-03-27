package JVM.模拟字符串常量池;

import java.util.ArrayList;

/**
 * StringPool:
 *
 * @Author XvYanpeng
 * @Date 2020/6/16 10:54
 */
public class StringPool {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void insert(String str) {
        if (strings.indexOf(str) == -1) {
            strings.add(str);
        } else {
            System.out.println("已存在该字符串");
        }
    }

    public static String get(String str) {
        for (String elem : strings) {
            if (str.equals(elem)) {
                return elem;
            }
        }
        System.out.println("不存在");
        return null;
    }
}
