package 结构型模式.代理模式;

/**
 * Proxy:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 13:13
 */
public class Proxy implements Subject {
    RealSubject realSubject = new RealSubject();

    @Override
    public void doSomeThing() {
        //增强
        System.out.println("代理pre增强");
        realSubject.doSomeThing();
        //增强
        System.out.println("代理post增强");
    }
}
