package squads;

import characters.humans.HumanArcher;
import characters.humans.HumanMage;
import characters.humans.HumanWarrior;

/**
 * Created by dmitr on 22.06.2017.
 */
class HumanSquad extends Squad {

    @Override
    protected void createSquad() {
        for (int i = 0; i < 4; i++) {
            charactersList.add(new HumanWarrior());
        }
        for (int i = 0; i < 3; i++) {
            charactersList.add(new HumanArcher());
        }
        charactersList.add(new HumanMage());
    }
}
