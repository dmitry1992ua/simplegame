package characters.humans;

import characters.Character;
import characters.strategy.WarriorStrategy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class HumanWarrior extends Character {

    public HumanWarrior() {
        this.damage = 18;
        this.actionStrategy = new WarriorStrategy(this);
    }

}
