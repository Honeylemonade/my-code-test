package 结构型模式.装饰者模式;

/**
 * Milk:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 14:02
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.15;
    }
}
