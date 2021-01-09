package site.licsber.ex7.facade;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        AbstractEncryptFacade encryptor = new EncryptFacade();
        encryptor.encrypt("raw.txt", "encrypt.txt");
    }
}
