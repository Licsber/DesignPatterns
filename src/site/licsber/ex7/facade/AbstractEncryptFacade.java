package site.licsber.ex7.facade;

import java.io.IOException;

public interface AbstractEncryptFacade {
    void encrypt(String src, String dst) throws IOException;
}
