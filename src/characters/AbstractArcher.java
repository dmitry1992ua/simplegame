package characters;

/**
 * Created by dmitr on 21.06.2017.
 */
public class AbstractArcher extends Character {

    protected int simpleAttackDamage;

    public int getSimpleAttackDamage() {
        return calculateDamage(simpleAttackDamage);
    }
}
