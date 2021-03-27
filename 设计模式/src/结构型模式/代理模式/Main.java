package 结构型模式.代理模式;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 13:14
 */
public class Main {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.doSomeThing();
    }
}
