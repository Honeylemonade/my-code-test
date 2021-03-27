package 行为型模式.状态模式;

/**
 * Main:篮球运动员根据状态，做出不同表现
 *
 * @Author XvYanpeng
 * @Date 2020/2/17 14:43
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("姚明", new GoodState());
        player1.performance();
        Player player2 = new Player("科比", new BadState());
        player2.performance();
    }
}
