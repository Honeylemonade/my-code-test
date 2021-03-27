package 创建型模式.抽象工厂模式;

/**
 * Main:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:46
 */
public class Main {
    public static void main(String[] args) {

        Factory factory;
        Gun gun;
        Bullet bullet;

        factory = new AK_Factory();
        bullet = factory.produceBullet();
        bullet.load();
        gun = factory.produceGun();
        gun.shooting();

    }
}
