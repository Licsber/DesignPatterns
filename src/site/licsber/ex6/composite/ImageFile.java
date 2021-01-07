package site.licsber.ex6.composite;

public class ImageFile extends AbstractFile {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    void killVirus() {
        System.out.printf("开始对图像文件%s杀毒.\n", name);
    }
}
