package LRU缓存实现;

import java.util.LinkedHashMap;

/**
 * Main:最近最少使用
 *
 * @Author XvYanpeng
 * @Date 2020/7/11 13:36
 */
public class Main {
    public static void main(String[] args) {
        //16,0.75,按照访问顺序进行排序
        LinkedHashMap cahche = new LinkedHashMap(16, 0.75f, true);
        cahche.put("a", 1);
        cahche.put("b", 2);
        cahche.put("c", 3);
        cahche.forEach((k, v) -> System.out.println(k + "->" + v));
        cahche.get("c");
        System.out.println("-----------------------");
        cahche.forEach((k, v) -> System.out.println(k + "->" + v));
    }
}
