package squads;

/**
 * Created by dmitr on 24.06.2017.
 */
public class Squads {

    private Squad alliesSquad;
    private Squad enemySquad;

    public void createSquads() {
        alliesSquad = SquadHelper.getRandomSquad(Race.HORDE);
        enemySquad = SquadHelper.getRandomSquad(Race.ALLIANCE);
    }

    public Squad getAlliesSquad() {
        return alliesSquad;
    }

    public Squad getEnemySquad() {
        return enemySquad;
    }
}
