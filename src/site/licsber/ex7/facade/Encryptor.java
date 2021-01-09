package site.licsber.ex7.facade;

public class Encryptor {
    public String encrypt(String content) {
        int len = content.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = content.charAt(i);
            res.append(ch % 2);
        }
        return res.toString();
    }
}
