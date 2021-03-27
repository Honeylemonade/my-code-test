package JVM.模拟字符串常量池;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/6/16 10:25
 */
public class Main {
    public static void main(String[] args) {
        StringPool.insert("abc");
        StringPool.insert("abc");
        System.out.println(StringPool.get("abc") == StringPool.get("abc"));
    }
}
