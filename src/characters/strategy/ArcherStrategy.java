package characters.strategy;

import characters.AbstractArcher;
import characters.Character;
import helpers.LogActionType;
import helpers.SimpleLogger;

/**
 * Created by dmitr on 21.06.2017.
 */
public class ArcherStrategy extends ActionStartegy {

    public ArcherStrategy(Character currentCharacter) {
        super(currentCharacter);
    }

    @Override
    public void action(Character character) {
        if (Math.random() > 0.5) {
            shoot(character);
        }
        else {
            simpleAttack(character);
        }
    }

    private void shoot(Character character) {
        character.setHitPoints(character.getHitPoints() - currentCharacter.getDamage());
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.COMBAT);
    }

    private void simpleAttack(Character character) {
        character.setHitPoints(character.getHitPoints() -
                ((AbstractArcher) currentCharacter).getSimpleAttackDamage());
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.ARCHER_SIMPLE_COMBAT);
    }
}
