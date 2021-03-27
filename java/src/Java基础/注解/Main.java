package Java基础.注解;

@MyAnnotation(2)
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //利用反射获取注解的信息
        Class c1 = Class.forName("注解.Main");
        MyAnnotation myAnnotation = (MyAnnotation) c1.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation);
        System.out.println(myAnnotation.value());
        System.out.println(myAnnotation.age());
        System.out.println(myAnnotation.name());
        //可以在下面进行一些骚操作
    }

}
