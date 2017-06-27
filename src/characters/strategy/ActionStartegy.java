package characters.strategy;

import characters.Character;

/**
 * Created by dmitr on 25.06.2017.
 */
public abstract class ActionStartegy {
    protected Character currentCharacter;

    public ActionStartegy (Character currentCharacter) {
        this.currentCharacter = currentCharacter;
    }
    public abstract void action(Character character);
}
