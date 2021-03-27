package Java基础.uuid;

import java.util.UUID;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/4/29 21:25
 */
public class Main {
    public static void main(String[] args) {
        //生成随机订单编号
        UUID uuid = UUID.randomUUID();

        //一般订单编号没有“-”号
        System.out.println(uuid);

        String str = uuid.toString();
        str = str.replaceAll("-", "");
        System.out.println(str);
    }
}
