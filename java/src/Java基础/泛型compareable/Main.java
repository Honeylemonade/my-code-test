package Java基础.泛型compareable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/5 17:28
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12);
        Student student2 = new Student(1);
        Student student3 = new Student(123);
        Student student4 = new Student(122);
        Student student5 = new Student(125);
        Student student6 = new Student(125);
        Student student7 = new Student(121);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);
        arrayList.add(student7);

        Sort.bubbleSort(arrayList);
        System.out.println(arrayList);
    }
}
