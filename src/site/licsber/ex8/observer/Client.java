package site.licsber.ex8.observer;

public class Client {
    public static void main(String[] args) {
        AbstractTeam team = new Team();
        new Player("玩家1", team);
        new Player("玩家2", team);
        new Player("玩家3", team);
        AbstractPlayer player4 = new Player("玩家4", team);
        player4.beAttack();
    }
}
