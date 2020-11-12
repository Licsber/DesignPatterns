package site.licsber.product;

public interface AbstractChart {
    default void draw() {
        System.out.println("默认画图方法, 可被子类重载.");
    }
}
