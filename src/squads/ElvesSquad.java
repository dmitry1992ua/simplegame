package squads;

import characters.elves.ElfArcher;
import characters.elves.ElfMage;
import characters.elves.ElfWarrior;

/**
 * Created by dmitr on 25.06.2017.
 */
class ElvesSquad extends Squad {

    @Override
    protected void createSquad() {
        for (int i = 0; i < 4; i++) {
            charactersList.add(new ElfWarrior());
        }
        for (int i = 0; i < 3; i++) {
            charactersList.add(new ElfArcher());
        }
        charactersList.add(new ElfMage());
    }
}
