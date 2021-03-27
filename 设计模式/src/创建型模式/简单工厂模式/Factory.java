package 创建型模式.简单工厂模式;

/**
 * Factory:只是把创建的步骤提取出来
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:08
 */
public class Factory {
    public static Shape getShap(String name) {
        if ("圆形".equals(name)) {
            return new Circle();
        }
        if ("矩形".equals(name)) {
            return new Rectangle();
        }
        return null;
    }
}
