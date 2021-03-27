package 创建型模式.工厂模式;

/**
 * Main:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:29
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new CircleFactory().getShape();
    }
}
