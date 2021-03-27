package 行为型模式.策略模式;

/**
 * Context:
 *
 * @Author XvYanpeng
 * @Date 2020/2/5 14:51
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
