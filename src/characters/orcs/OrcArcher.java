package characters.orcs;

import characters.AbstractArcher;
import characters.strategy.ArcherStrategy;

/**
 * Created by dmitr on 22.06.2017.
 */
public class OrcArcher extends AbstractArcher {

    public OrcArcher() {
        damage = 3;
        simpleAttackDamage = 2;
        isHorde = true;
        actionStrategy = new ArcherStrategy(this);
    }
}
