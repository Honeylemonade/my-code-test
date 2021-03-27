package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee:
 *
 * @Author XvYanpeng
 * @Date 2020/2/17 13:13
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private ArrayList<Employee> subordinates;

    //构造函数
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
