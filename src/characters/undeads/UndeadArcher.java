package characters.undeads;

import characters.AbstractArcher;
import characters.strategy.ArcherStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class UndeadArcher extends AbstractArcher {

    public UndeadArcher() {
        damage = 4;
        simpleAttackDamage = 2;
        isHorde = true;
        actionStrategy = new ArcherStrategy(this);
    }
}
