package characters.humans;

import characters.Character;
import characters.strategy.MageStrategy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class HumanMage extends Character {

    public HumanMage() {
        damage = 4;
        canImprove = true;
        actionStrategy = new MageStrategy(this);
    }
}
