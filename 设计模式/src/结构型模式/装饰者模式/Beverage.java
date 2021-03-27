package 结构型模式.装饰者模式;

/**
 * Beverage:饮料类
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 13:53
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
