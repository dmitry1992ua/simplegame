package characters.elves;

import characters.AbstractArcher;
import characters.strategy.ArcherStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class ElfArcher extends AbstractArcher {

    public ElfArcher() {
        damage = 7;
        simpleAttackDamage = 3;
        actionStrategy = new ArcherStrategy(this);
    }
}
