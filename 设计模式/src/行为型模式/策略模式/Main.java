package 行为型模式.策略模式;

/**
 * Test:
 *
 * @Author XvYanpeng
 * @Date 2020/2/5 14:48
 */
public class Main {
    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        Context context = new Context(addStrategy);
        // 输出3
        System.out.println(context.calculate(1, 2));

        Strategy subStrategy = new SubtractStrategy();
        // 动态替换算法(策略)
        context = new Context(subStrategy);
        // 输出-1
        System.out.println(context.calculate(1, 2));
    }
}
