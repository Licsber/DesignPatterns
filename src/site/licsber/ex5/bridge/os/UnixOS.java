package site.licsber.ex5.bridge.os;

public class UnixOS extends OS {
    @Override
    public void show() {
        System.out.println("现在是Unix操作系统.");
        imageFile.draw();
    }
}
