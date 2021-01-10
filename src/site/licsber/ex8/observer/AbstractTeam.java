package site.licsber.ex8.observer;

public interface AbstractTeam {
    void join(AbstractPlayer player);

    void setMsg(String msg);

    void notifyAllObservers();

    String getMsg();
}
