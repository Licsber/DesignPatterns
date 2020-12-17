package site.licsber.ex5.bridge.os;

import site.licsber.ex5.bridge.file.ImageFile;

public abstract class OS {
    protected ImageFile imageFile;

    public void setImageFile(ImageFile imageFile) {
        this.imageFile = imageFile;
    }

    public abstract void show();
}
