package site.licsber.ex4.single;

public class MoonStaticInnerClass implements Moon {
    private static class NestClass {
        private static final MoonStaticInnerClass instance
                = new MoonStaticInnerClass();
    }

    private MoonStaticInnerClass() {
        System.out.println("我被创建了");
    }

    public static Moon getInstance() {
        return NestClass.instance;
    }
}
