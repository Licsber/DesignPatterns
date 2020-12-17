package site.licsber.ex5.bridge.os;

public class LinuxOS extends OS {
    @Override
    public void show() {
        System.out.println("现在是Linux操作系统.");
        imageFile.draw();
    }
}
