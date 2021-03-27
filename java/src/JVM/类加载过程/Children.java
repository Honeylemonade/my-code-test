package JVM.类加载过程;

/**
 * Children:
 *
 * @Author XvYanpeng
 * @Date 2020/4/28 7:35
 */
public class Children extends Parent {
    static String name1 = "子类静态变量";
    String addres1 = "子类非静态变量";

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类非静态代码块");
    }

    public Children() {
        System.out.println("子类构造方法");
    }
}
