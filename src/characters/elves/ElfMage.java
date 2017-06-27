package characters.elves;

import characters.Character;
import characters.strategy.MageStrategy;

/**
 * Created by dmitr on 25.06.2017.
 */
public class ElfMage extends Character {

    public ElfMage() {
        damage = 10;
        canImprove = true;
        actionStrategy = new MageStrategy(this);
    }
}
