package 创建型模式.抽象工厂模式;

/**
 * Factory:
 *
 * @author XvYanPeng
 * @date 2019/10/30 10:46
 */
public interface Factory {
    public Gun produceGun();

    public Bullet produceBullet();
}
