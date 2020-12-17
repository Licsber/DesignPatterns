package site.licsber.ex5.bridge.file;

public class GIF implements ImageFile {
    @Override
    public void draw() {
        System.out.println("现在是GIF格式.");
    }
}
