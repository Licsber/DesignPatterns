package site.licsber.ex7.proxy;

public class QueryProxy implements AbstractQuery {
    AbstractQuery query = new Query();
    AbstractValidator validator = new Validator();
    AbstractLogger logger = new Logger();

    @Override
    public void query(String username, String password) {
        if (validator.valid(username, password)) {
            logger.log(username);
            query.query(username, password);
        } else {
            System.out.println("未授权");
        }
    }
}
