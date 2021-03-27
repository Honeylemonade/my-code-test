package Java基础.注解;

import java.lang.annotation.*;

/**
 * MyAnnotation:
 *
 * @Author XvYanpeng
 * @Date 2020/7/5 21:31
 */
//元注解：可以注解在什么上面
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//Runtime表示这个注解在所有地方都有效，无论是源码时，还是class时，一般自定义注解都用Runtime
@Retention(RetentionPolicy.RUNTIME)
//是否生成该注解的Javadoc
@Documented
//子类可以继承父类的注解
@Inherited
public @interface MyAnnotation {
    //注解参数的格式：参数类型+参数名+()[default 默认值](如果没有默认值，则必须显示的赋值)
    //如果参数名为value，则在使用时，不需要写value=1，直接写@MyAnnotation(1)即可
    int value();

    String name() default "许颜鹏";

    int age() default 1;

}
