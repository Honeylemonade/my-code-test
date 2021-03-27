package 结构型模式.代理模式;

/**
 * RealSubject:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 13:13
 */
public class RealSubject implements Subject {
    @Override
    public void doSomeThing() {
        System.out.println("我是原始对象，做了一些事情");
    }
}
