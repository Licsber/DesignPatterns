package site.licsber.ex6.composite;

public abstract class AbstractFile {
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    void killVirus() {
        throw new RuntimeException("不支持的操作");
    }

    void add(AbstractFile file) {
        throw new RuntimeException("不支持的操作");
    }

    void remove(AbstractFile file) {
        throw new RuntimeException("不支持的操作");
    }

    AbstractFile get(int i) {
        throw new RuntimeException("不支持的操作");
    }
}
