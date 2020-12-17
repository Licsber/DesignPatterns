package site.licsber.ex5.bridge.file;

public class BMP implements ImageFile {
    @Override
    public void draw() {
        System.out.println("现在是BMP格式.");
    }
}
