package characters.humans;

import characters.AbstractArcher;
import characters.strategy.ArcherStrategy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class HumanArcher extends AbstractArcher {

    public HumanArcher() {
        damage = 5;
        simpleAttackDamage = 3;
        actionStrategy = new ArcherStrategy(this);
    }

}
