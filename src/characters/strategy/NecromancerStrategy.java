package characters.strategy;

import characters.Character;
import helpers.LogActionType;
import helpers.SimpleLogger;

/**
 * Created by dmitr on 21.06.2017.
 */
public class NecromancerStrategy extends ActionStartegy {

    public NecromancerStrategy(Character currentCharacter) {
        super(currentCharacter);
    }

    @Override
    public void action(Character character) {
        if (Math.random() > 0.5) {
            attack(character);
        }
        else {
            curse(character);
        }
    }

    private void attack(Character character) {
        character.setHitPoints(character.getHitPoints() - currentCharacter.getDamage());
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.COMBAT);
    }

    private void curse(Character character) {
        character.setCurse(true);
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.CURSE);
    }
}
