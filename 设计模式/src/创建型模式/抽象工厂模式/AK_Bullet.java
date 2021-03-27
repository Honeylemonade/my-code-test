package 创建型模式.抽象工厂模式;

/**
 * AK_Bullet:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:45
 */
public class AK_Bullet implements Bullet {

    @Override
    public void load() {
        System.out.println("Load bullets with AK");
    }

}
