package squads;

/**
 * Created by dmitr on 25.06.2017.
 */
public class SquadHelper {

    private static Class[] aliance = {HumanSquad.class, ElvesSquad.class};
    private static Class[] horde = {OrcSquad.class, UndeadSquad.class};

    public static Squad getRandomSquad(Race race){
        try {
            if (race == Race.ALLIANCE) {
                return (Squad) aliance[getRandomIndex(aliance.length)].newInstance();
            }
            else if (race == Race.HORDE) {
                return (Squad) horde[getRandomIndex(horde.length)].newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getRandomIndex(int arrLenth) {
        int num = 0 + (int) (Math.random() * arrLenth);
        return num;
    }
}