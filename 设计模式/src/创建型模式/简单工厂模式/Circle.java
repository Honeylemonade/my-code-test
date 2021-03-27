package 创建型模式.简单工厂模式;

/**
 * Circle:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:06
 */
public class Circle extends Shape {
    int r;

    @Override
    public void display() {
        System.out.println("我是一个圆形");
    }
}
