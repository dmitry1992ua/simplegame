package characters.strategy;

import characters.Character;
import helpers.LogActionType;
import helpers.SimpleLogger;

/**
 * Created by dmitr on 21.06.2017.
 */
public class WarriorStrategy extends ActionStartegy {

    public WarriorStrategy(Character currentCharacter) {
        super(currentCharacter);
    }

    @Override
    public void action(Character character) {
        character.setHitPoints(character.getHitPoints() - currentCharacter.getDamage());
        SimpleLogger.printActionLog(currentCharacter, character, LogActionType.COMBAT);
    }
}
