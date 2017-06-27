package characters;

import characters.strategy.ActionStartegy;

/**
 * Created by dmitr on 21.06.2017.
 */
public class Character {

    private int hitPoints = 100;
    protected int damage;
    protected boolean isHorde = false;
    protected boolean isImproveOnNextStep = false;
    protected boolean isImprove = false;
    protected boolean isCurse = false;
    protected boolean canImprove = false;
    protected ActionStartegy actionStrategy;

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
       return calculateDamage(damage);
    }

    protected int calculateDamage(int damage) {
        if (isCurse) {
            if (isImprove) {
                return (int) ((damage * 1.5) / 2);
            }
            return damage / 2;
        }
        if (isImprove) {
            return (int) (damage * 1.5);
        }
        return damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isHorde() {
        return isHorde;
    }

    public void setImprove(boolean improve) {
        isImprove = improve;
    }

    public void setCurse(boolean curse) {
        isCurse = curse;
    }

    public boolean isCanImprove() {
        return canImprove;
    }

    public boolean isImproveOnNextStep() {
        return isImproveOnNextStep;
    }

    public void setImproveOnNextStep(boolean improveOnNextStep) {
        isImproveOnNextStep = improveOnNextStep;
    }

    public void action(Character character) {
        actionStrategy.action(character);
    }
}
