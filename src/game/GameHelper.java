package game;

import characters.Character;

import java.util.ArrayList;

/**
 * Created by dmitr on 24.06.2017.
 */
class GameHelper {

    public static Character getRandomCharacterFromList(ArrayList<Character> characters) {
        return characters.get(0 + (int) (Math.random() * characters.size()));
    }

    public static Character getRandomCharacterFromLists(ArrayList<Character> alliesCharacters,
                                                        ArrayList<Character> enemyCharacters) {
        return getRandomCharacterFromList((0 + (int) (Math.random() * 2) == 0 ? alliesCharacters : enemyCharacters));
    }
}
