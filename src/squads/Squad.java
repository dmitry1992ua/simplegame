package squads;

import characters.Character;

import java.util.ArrayList;

/**
 * Created by dmitr on 22.06.2017.
 */
public abstract class Squad {

    protected ArrayList<Character> charactersList;

    public Squad() {
        this.charactersList = new ArrayList<>();
        createSquad();
    }

    protected abstract void createSquad();

    public ArrayList<Character> getCharactersList() {
        return charactersList;
    }

    public boolean isSquadDead () {
        return charactersList.isEmpty();
    }
}
