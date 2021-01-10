package site.licsber.ex8.observer;

import java.util.ArrayList;
import java.util.List;

public class Team implements AbstractTeam {
    private final List<AbstractPlayer> players = new ArrayList<>();
    private String msg;

    @Override
    public void join(AbstractPlayer player) {
        players.add(player);
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for (AbstractPlayer player : players) {
            player.update();
        }
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
