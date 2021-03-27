package Java基础.反射;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射获取集合泛型类型:
 *
 * @Author XvYanpeng
 * @Date 2020/7/6 16:43
 */
public class 反射获取集合泛型类型 {

    public static <T> void proccess(List<T> list) throws Exception {
        Class clazz = 反射获取集合泛型类型.class;
        Method method = 反射获取集合泛型类型.class.getMethod("proccess", List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericType : genericParameterTypes) {
            if (genericType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericType;
                Type[] types = parameterizedType.getActualTypeArguments();
                for (Type type : types) {
                    Class realType = (Class) type;
                    System.out.println("方法参数的类型：" + realType);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        proccess(new ArrayList<Integer>());
    }
}
