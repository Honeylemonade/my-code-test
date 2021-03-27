package 行为型模式.状态模式;

/**
 * Player:篮球运动员类
 *
 * @Author XvYanpeng
 * @Date 2020/2/17 14:46
 */
public class Player {
    String name;
    State state;

    public Player(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public void performance() {
        this.state.performance();
    }
}
