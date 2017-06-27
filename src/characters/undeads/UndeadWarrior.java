package characters.undeads;

import characters.Character;
import characters.strategy.WarriorStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class UndeadWarrior extends Character {

    public UndeadWarrior() {
        this.damage = 18;
        isHorde = true;
        this.actionStrategy = new WarriorStrategy(this);
    }
}
