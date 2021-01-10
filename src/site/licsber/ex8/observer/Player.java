package site.licsber.ex8.observer;

public class Player extends AbstractPlayer {
    public Player(String name, AbstractTeam team) {
        super(name, team);
    }

    @Override
    public void update() {
        System.out.println(name + "收到以下消息：");
        System.out.println(team.getMsg());
    }

    @Override
    public void beAttack() {
        team.setMsg(name + "被攻击啦");
    }
}
