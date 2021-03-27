package 创建型模式.抽象工厂模式;

/**
 * M4A1_Factory:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:46
 */
public class M4A1_Factory implements Factory {

    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    @Override
    public Bullet produceBullet() {
        return new M4A1_Bullet();
    }

}
