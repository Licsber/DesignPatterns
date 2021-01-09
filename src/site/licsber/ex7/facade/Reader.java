package site.licsber.ex7.facade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public String read(String file) throws IOException {
        return new BufferedReader(new FileReader(file)).readLine();
    }
}
