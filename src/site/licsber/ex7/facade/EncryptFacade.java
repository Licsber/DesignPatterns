package site.licsber.ex7.facade;

import java.io.IOException;

public class EncryptFacade implements AbstractEncryptFacade {
    private final Reader reader = new Reader();
    private final Encryptor encryptor = new Encryptor();
    private final Saver saver = new Saver();

    @Override
    public void encrypt(String src, String dst) throws IOException {
        String content = reader.read(src);
        content = encryptor.encrypt(content);
        saver.save(dst, content);
    }
}
