package Java并发.指令重排序;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/5/4 9:19
 */
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        x = x + 5;
        y = x * x;
        System.out.println(y);
    }
}
