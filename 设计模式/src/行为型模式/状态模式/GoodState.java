package 行为型模式.状态模式;

/**
 * GoodState:
 *
 * @Author XvYanpeng
 * @Date 2020/2/17 14:45
 */
public class GoodState implements State {
    @Override
    public void performance() {
        System.out.println("表现良好");
    }
}
