package Java基础.枚举;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/7/11 17:58
 */
public class Main {

    public enum ColorEnum {
        RED, GREEN, BLUE;
    }

    /**
     * 枚举类的好处，限制输入的常量类型属于什么类型
     * 可以防止用户传递任意字符串，而只能传递枚举中声明的类型
     */
    public static void test(ColorEnum colorEnum) {
        sout(colorEnum.name());
        sout(colorEnum.toString());
    }

    public static void sout(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        test(ColorEnum.GREEN);
    }
}
