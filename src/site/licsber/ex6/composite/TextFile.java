package site.licsber.ex6.composite;

public class TextFile extends AbstractFile {
    public TextFile(String name) {
        super(name);
    }

    @Override
    void killVirus() {
        System.out.printf("开始对文本文件%s杀毒.\n", name);
    }
}