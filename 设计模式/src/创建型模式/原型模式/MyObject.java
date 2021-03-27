package 创建型模式.原型模式;

/**
 * MyObject:
 *
 * @Author XvYanpeng
 * @Date 2020/4/14 10:48
 */
public class MyObject implements Cloneable {
    public int val = 1;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
