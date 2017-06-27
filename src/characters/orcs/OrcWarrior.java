package characters.orcs;

import characters.Character;
import characters.strategy.WarriorStrategy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class OrcWarrior extends Character {

    public OrcWarrior() {
        damage = 20;
        isHorde = true;
        actionStrategy = new WarriorStrategy(this);
    }
}
