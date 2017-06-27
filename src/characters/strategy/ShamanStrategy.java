package characters.strategy;

import characters.Character;
import helpers.LogActionType;
import helpers.SimpleLogger;

/**
 * Created by dmitr on 21.06.2017.
 */

public class ShamanStrategy extends ActionStartegy {

    public ShamanStrategy(Character currentCharacter) {
        super(currentCharacter);
    }

    @Override
    public void action(Character character) {
        if (character.isHorde()) {
            improve(character);
        }
        else {
            curse(character);
        }
    }

    private void curse(Character character) {
        character.setImproveOnNextStep(false);
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.CURSE);
    }

    private void improve(Character character) {
        character.setImproveOnNextStep(true);
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.IMPROVE);
    }

}
