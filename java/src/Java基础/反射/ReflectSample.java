package Java基础.反射;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflect:
 *
 * @Author XvYanpeng
 * @Date 2020/3/22 12:18
 */
public class ReflectSample {
    /**
     * 正常由new创建的对象，只能调用其public方法，但是反射却能获取到private方法
     * getDeclaredMethod：只能获取到类中声明出的方法和属性，包括public，private和protected
     */
    public static void main(String[] args) throws Exception {
        Class rc = Class.forName("Java基础.反射.Robot");
        System.out.println("className is:" + rc.getName());
        Robot robot = (Robot) rc.newInstance();


        Method privateSayHi = rc.getDeclaredMethod("privateSayHi", String.class);
        //提供private方法的访问权限
        privateSayHi.setAccessible(true);
        privateSayHi.invoke(robot, "123");


        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot, "Tom");


        Method publicSayHi = rc.getMethod("publicSayHi", String.class);
        publicSayHi.invoke(robot, "456");
    }
}
