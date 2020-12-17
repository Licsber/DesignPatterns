package site.licsber.ex5.bridge.file;

public class PNG implements ImageFile {
    @Override
    public void draw() {
        System.out.println("现在是PNG格式.");
    }
}
