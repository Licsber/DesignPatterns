package site.licsber.ex4.single;

public class MoonHungry implements Moon {
    private static final MoonHungry instance = new MoonHungry();

    private MoonHungry() {
        System.out.println("我被创建了");
    }

    public static Moon getInstance() {
        return instance;
    }
}
