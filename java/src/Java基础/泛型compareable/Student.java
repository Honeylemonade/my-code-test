package Java基础.泛型compareable;

/**
 * Student:
 *
 * @Author XvYanpeng
 * @Date 2020/4/19 14:23
 */
public class Student implements Comparable {
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Student) o).getId();
    }
}
