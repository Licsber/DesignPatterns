package site.licsber.ex7.proxy;

public class Client {
    public static void main(String[] args) {
        AbstractQuery query = new QueryProxy();
        query.query("202181122", "liujl");
    }
}
