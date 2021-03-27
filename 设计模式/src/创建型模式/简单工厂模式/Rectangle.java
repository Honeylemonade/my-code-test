package 创建型模式.简单工厂模式;

/**
 * Rectangle:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:07
 */
public class Rectangle extends Shape {
    int a;
    int b;

    @Override
    public void display() {
        System.out.println("我是一个矩形");
    }
}
