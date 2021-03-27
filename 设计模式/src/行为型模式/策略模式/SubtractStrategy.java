package 行为型模式.策略模式;

/**
 * SubtractStrategy:
 *
 * @Author XvYanpeng
 * @Date 2020/2/5 14:52
 */
public class SubtractStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
