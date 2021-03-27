package Java基础.反射.反射修改方法上注解属性;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Main:
 * 请参考 https://blog.csdn.net/u014750606/article/details/79977114
 *
 * @Author XvYanpeng
 * @Date 2020/7/15 22:31
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class tempClassClass = Class.forName("Java基础.反射.反射修改方法上注解属性.TempClass");
        Method testMethod = tempClassClass.getMethod("test");
        MyAnotation annotation = testMethod.getAnnotation(MyAnotation.class);
        InvocationHandler h = Proxy.getInvocationHandler(annotation);
        Field hfield = h.getClass().getDeclaredField("memberValues");
        hfield.setAccessible(true);
        Map memberValues = (Map) hfield.get(h);
        memberValues.put("age", 2);
        System.out.println(annotation.age());

    }
}
