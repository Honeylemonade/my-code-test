package 创建型模式.简单工厂模式;

/**
 * Main:这样的实现有个问题，如果我们新增产品类的话，就需要修改工厂类中的getShape（）方法，这很明显不符合 开放-封闭原则 。
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:08
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = Factory.getShap("圆形");
        circle.display();
    }
}
