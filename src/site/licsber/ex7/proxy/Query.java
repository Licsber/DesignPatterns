package site.licsber.ex7.proxy;

public class Query implements AbstractQuery{
    @Override
    public void query(String username, String password) {
        System.out.println("信息查询成功");
    }
}
