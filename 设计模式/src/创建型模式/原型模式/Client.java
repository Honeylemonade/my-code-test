package 创建型模式.原型模式;

/**
 * Client:
 *
 * @Author XvYanpeng
 * @Date 2020/4/14 10:30
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject o = new MyObject();
        MyObject o2 = (MyObject) o.clone();
        System.out.println(o2.val);
    }
}
