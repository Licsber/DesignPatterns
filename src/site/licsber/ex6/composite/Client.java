package site.licsber.ex6.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile root = new Folder("/");
        AbstractFile subFolder = new Folder("/202181122");
        AbstractFile file1 = new TextFile("file1");
        AbstractFile file2 = new ImageFile("file2");
        AbstractFile file3 = new ImageFile("file3");

        subFolder.add(file3);
        root.add(subFolder);
        root.add(file1);
        root.add(file2);

        root.killVirus();
    }
}
