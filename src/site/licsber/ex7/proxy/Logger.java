package site.licsber.ex7.proxy;

public class Logger implements AbstractLogger {
    @Override
    public void log(String log) {
        System.out.println("记录一次查询日志: " + log);
    }
}
