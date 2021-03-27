package JVM.类加载过程;

/**
 * Parent:
 *
 * @Author XvYanpeng
 * @Date 2020/4/28 7:36
 */
public class Parent {
    static String name = "父类静态变量";
    String addres = "父类非静态变量";

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类非静态代码块");
    }

    public Parent() {
        System.out.println("父类构造方法");
    }
}
