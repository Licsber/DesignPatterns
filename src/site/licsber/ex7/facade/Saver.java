package site.licsber.ex7.facade;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public void save(String dst, String content) throws IOException {
        new FileWriter(dst).write(content);
    }
}
