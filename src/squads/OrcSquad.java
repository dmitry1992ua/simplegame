package squads;

import characters.orcs.OrcArcher;
import characters.orcs.OrcShaman;
import characters.orcs.OrcWarrior;

/**
 * Created by dmitr on 22.06.2017.
 */
class OrcSquad extends Squad {

    @Override
    protected void createSquad() {
        for (int i = 0; i < 4; i++) {
            charactersList.add(new OrcWarrior());
        }
        for (int i = 0; i < 3; i++) {
            charactersList.add(new OrcArcher());
        }
        charactersList.add(new OrcShaman());
    }
}
