package site.licsber.ex7.proxy;

public class Validator implements AbstractValidator {
    @Override
    public boolean valid(String username, String password) {
        return "202181122".equals(username) && "liujl".equals(password);
    }
}
