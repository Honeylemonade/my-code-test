package Java基础.JDK新特性;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * MyStream:
 *
 * @Author XvYanpeng
 * @Date 2020/4/12 8:07
 */
public class MyStream {
    public static void t() {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        //filter过滤
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);


        //filter过滤,sort排序
        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        //map映射
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //match匹配*************************
        //存在匹配
        boolean anyStartWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartWithA);

        //全部匹配
        boolean allStartWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartWithA);

        //没有匹配
        boolean noneStartWithA =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartWithA);

        //count计数
        long startsWithB = stringCollection
                .stream()
                .filter((s) -> s.startsWith("b"))
                .count();
        System.out.println(startsWithB);

        //reduce规约
        Optional<String> reduced = stringCollection
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);

        //需要注意的是，排序只创建了一个排列好后的Stream，而不会影响原有的数据源，排序之后原数据stringCollection是不会被修改的：
        System.out.println(stringCollection.toString());
    }

    /**
     * distinct默认会根据对象的hashcode类进行去重
     */
    public static void testDistinc() {
        People p1 = new People("aaa", 1);
        People p2 = new People("aaa", 1);
        List<People> peoples = new ArrayList<>();
        peoples.add(p1);
        peoples.add(p2);
        long count = peoples.stream().distinct().count();
        System.out.println(count);

    }

    public static void main(String[] args) {
        testDistinc();

    }
}
