package JVM.类加载器;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * MyClassLoader:
 *
 * @Author XvYanpeng
 * @Date 2020/4/25 10:59
 */
public class MyClassLoader extends ClassLoader {
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    @Override
    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    //用于加载类文件
    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        //.........
        return null;
    }


}
