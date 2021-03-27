package Java基础.序列化.jdk序列化;

import java.io.Serializable;

/**
 * Student:
 *
 * @Author XvYanpeng
 * @Date 2020/4/19 13:21
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -1365996362810350255L;
    String name = "123";
    transient String adress = "asddas";
}
