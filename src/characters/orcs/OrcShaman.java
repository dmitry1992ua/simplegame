package characters.orcs;

import characters.Character;
import characters.strategy.ShamanStrategy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class OrcShaman extends Character {

    public OrcShaman() {
        canImprove = true;
        isHorde = true;
        actionStrategy = new ShamanStrategy(this);
    }
}
