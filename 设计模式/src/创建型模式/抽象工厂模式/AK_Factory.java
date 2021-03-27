package 创建型模式.抽象工厂模式;

/**
 * AK_Factory:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:46
 */
public class AK_Factory implements Factory {

    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }

}
