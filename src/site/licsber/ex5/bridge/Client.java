package site.licsber.ex5.bridge;

import site.licsber.ex5.bridge.file.GIF;
import site.licsber.ex5.bridge.file.ImageFile;
import site.licsber.ex5.bridge.os.LinuxOS;
import site.licsber.ex5.bridge.os.OS;

public class Client {
    public static void main(String[] args) {
        ImageFile imageFile = new GIF();
        OS os = new LinuxOS();
        os.setImageFile(imageFile);
        os.show();
    }
}
