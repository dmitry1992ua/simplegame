package characters.elves;

import characters.Character;
import characters.strategy.WarriorStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class ElfWarrior extends Character {

    public ElfWarrior() {
        this.damage = 15;
        this.actionStrategy = new WarriorStrategy(this);
    }
}
