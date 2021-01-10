package site.licsber.ex8.observer;

public abstract class AbstractPlayer {
    protected final String name;
    protected final AbstractTeam team;

    public AbstractPlayer(String name, AbstractTeam team) {
        this.name = name;
        this.team = team;
        team.join(this);
    }

    public abstract void update();

    public abstract void beAttack();
}
