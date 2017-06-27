package characters.undeads;

import characters.Character;
import characters.strategy.NecromancerStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class UndeadNecromancer extends Character {

    public UndeadNecromancer() {
        damage = 5;
        isHorde = true;
        actionStrategy = new NecromancerStrategy(this);
    }
}
