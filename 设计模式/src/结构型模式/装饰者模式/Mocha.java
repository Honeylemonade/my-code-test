package 结构型模式.装饰者模式;

/**
 * Mocha:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 14:00
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.2;
    }
}
