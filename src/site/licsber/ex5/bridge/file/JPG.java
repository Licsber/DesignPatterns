package site.licsber.ex5.bridge.file;

public class JPG implements ImageFile {
    @Override
    public void draw() {
        System.out.println("现在是JPG格式.");
    }
}
