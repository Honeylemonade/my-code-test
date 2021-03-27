package Java基础.反射;

/**
 * Robot:
 *
 * @Author XvYanpeng
 * @Date 2020/3/22 12:19
 */
public class Robot {
    private String name;

    private void privateSayHi(String str) {
        System.out.println(name + " private say hi and :" + str);
    }

    public void publicSayHi(String str) {
        System.out.println(name + " public say hi and :" + str);
    }
}
