package game;

import characters.Character;
import helpers.SimpleLogger;
import squads.Squad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dmitr on 24.06.2017.
 */
class GameStep {

    private Squad alliesSquad;
    private Squad enemySquad;

    public GameStep(Squad alliesSquad, Squad enemySquad) {
        this.alliesSquad = alliesSquad;
        this.enemySquad = enemySquad;
    }

    public boolean executeStep() {
        ArrayList<Character> alliesCharacters = new ArrayList<>(alliesSquad.getCharactersList());
        ArrayList<Character> alliesPremiumCharacters = null;

        alliesPremiumCharacters = getPremiumCharacters(alliesCharacters);

        if (alliesPremiumCharacters != null) {
            boolean isEnemySquadDead = squadStep(alliesPremiumCharacters);
            if (isEnemySquadDead) {
                return isEnemySquadDead;
            }
        }
        return squadStep(alliesCharacters);
    }

    private ArrayList<Character> getPremiumCharacters(ArrayList<Character> characters) {
        ArrayList<Character> premiumCharacters = new ArrayList<>();

        Iterator<Character> characterIterator = characters.iterator();
        while(characterIterator.hasNext()) {
            Character currentChar = characterIterator.next();
            if (currentChar.isImproveOnNextStep()) {
                currentChar.setImprove(true);
                currentChar.setImproveOnNextStep(false);
                premiumCharacters.add(currentChar);
                characterIterator.remove();
            }
        }

        return premiumCharacters.isEmpty() ? null : premiumCharacters;
    }
    private boolean squadStep(ArrayList<Character> characters) {
        while (characters.size() > 0 && enemySquad.getCharactersList().size() > 0) {
            Character currentCharacter = GameHelper.getRandomCharacterFromList(characters);
            action(currentCharacter);
            characters.remove(currentCharacter);
        }

        if (enemySquad.getCharactersList().size() < 1) {
            return true;
        }

        resetCharacterAttributes(alliesSquad.getCharactersList());
        return false;
    }

    private void action(Character character) {
        Character anotherCharacter;
        if (character.isCanImprove()) {
            anotherCharacter = GameHelper.getRandomCharacterFromLists(alliesSquad.getCharactersList(),
                    enemySquad.getCharactersList());
            character.action(anotherCharacter);
        }
        else {
            anotherCharacter = GameHelper.getRandomCharacterFromList(enemySquad.getCharactersList());
            character.action(anotherCharacter);
        }

        if (character != anotherCharacter) {
            if (anotherCharacter.getHitPoints() < 1) {
                enemySquad.getCharactersList().remove(anotherCharacter);
                SimpleLogger.printLog(anotherCharacter.getClass().getSimpleName() + " умер");
            }
        }
    }

    private void resetCharacterAttributes(ArrayList<Character> characters) {
        for (Character character : characters) {
            character.setImprove(false);
            character.setCurse(false);
        }
    }
}
