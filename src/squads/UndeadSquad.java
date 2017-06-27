package squads;

import characters.undeads.UndeadArcher;
import characters.undeads.UndeadNecromancer;
import characters.undeads.UndeadWarrior;

/**
 * Created by dmitr on 25.06.2017.
 */
class UndeadSquad extends Squad {

    @Override
    protected void createSquad() {
        for (int i = 0; i < 4; i++) {
            charactersList.add(new UndeadWarrior());
        }
        for (int i = 0; i < 3; i++) {
            charactersList.add(new UndeadArcher());
        }
        charactersList.add(new UndeadNecromancer());
    }
}
