package 结构型模式.装饰者模式;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 14:03
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());

    }
}
