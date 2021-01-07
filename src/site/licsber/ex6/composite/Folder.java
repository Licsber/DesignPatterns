package site.licsber.ex6.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    private final List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    void killVirus() {
        System.out.printf("开始对文件夹%s杀毒.\n", name);
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }

    @Override
    void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    AbstractFile get(int i) {
        return list.get(i);
    }
}
