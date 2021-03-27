package 结构型模式.装饰者模式;

/**
 * Espresso:意式浓缩咖啡类
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 13:59
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
