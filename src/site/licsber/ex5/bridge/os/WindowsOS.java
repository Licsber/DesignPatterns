package site.licsber.ex5.bridge.os;

public class WindowsOS extends OS {
    @Override
    public void show() {
        System.out.println("现在是Windows操作系统.");
        imageFile.draw();
    }
}
