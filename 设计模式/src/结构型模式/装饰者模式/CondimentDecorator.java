package 结构型模式.装饰者模式;

/**
 * CondimentDecorator:调味品装饰类
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 13:56
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
