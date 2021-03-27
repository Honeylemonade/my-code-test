package Java基础.JDK新特性;

import java.util.Objects;

/**
 * People:
 *
 * @Author XvYanpeng
 * @Date 2020/7/7 23:01
 */

public class People {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof People)) {
            return false;
        }
        People people = (People) o;
        return age == people.age &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
