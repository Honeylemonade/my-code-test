package Java基础.JDK新特性;

import java.util.*;

/**
 * MyLamada:
 *
 * @Author XvYanpeng
 * @Date 2020/4/12 7:09
 */
public class MyLamada {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "amam", "mika", "peggy");


        //传统方法
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        //Lamada
        Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));


        System.out.println(names.toString());
    }
}
