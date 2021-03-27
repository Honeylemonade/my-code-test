package 创建型模式.工厂模式;


/**
 * CircleFactory:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:26
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
