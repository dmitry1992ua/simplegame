package characters.strategy;

import characters.Character;
import helpers.LogActionType;
import helpers.SimpleLogger;

/**
 * Created by dmitr on 21.06.2017.
 */
public class MageStrategy extends ActionStartegy {

    public MageStrategy(Character currentCharacter) {
        super(currentCharacter);
    }

    @Override
    public void action(Character character) {
        if (character.isHorde()) {
            attack(character);
        }
        else {
            improve(character);
        }
    }

    private void attack(Character character) {
        character.setHitPoints(character.getHitPoints() - currentCharacter.getDamage());
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.COMBAT);

    }

    private void improve(Character character) {
        character.setImproveOnNextStep(true);
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.IMPROVE);
    }
}
