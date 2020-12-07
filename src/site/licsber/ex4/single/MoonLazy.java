package site.licsber.ex4.single;

public class MoonLazy implements Moon {
    private static MoonLazy instance;

    private MoonLazy() {
        System.out.println("我被创建了");
    }

    public Moon getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new MoonLazy();
                }
            }
        }
        return instance;
    }
}
