package helpers;

import characters.AbstractArcher;
import characters.Character;
import squads.Squad;

import java.util.ArrayList;

/**
 * Created by dmitr on 24.06.2017.
 */
public class SimpleLogger {

    private static ArrayList<String> logs = new ArrayList<>();
    private static String log;

    public static void printLog(String log) {
        System.out.println(log);
        logs.add(log + "\r\n");
    }

    public static void printActionLog(Character currentCharacter, Character anotherCharacter, LogActionType logActionType) {
        switch (logActionType) {
            case COMBAT:
                log = String.format("%s нанёс %s %d урона.", getSimpleName(currentCharacter),
                        getSimpleName(anotherCharacter), currentCharacter.getDamage());
                break;
            case IMPROVE:
                log = String.format("%s наложил улучшение на %s.", getSimpleName(currentCharacter),
                        getSimpleName(anotherCharacter));
                break;
            case CURSE:
                log = String.format("%s наложил проклятье на %s.", getSimpleName(currentCharacter),
                        getSimpleName(anotherCharacter));
                break;
            case ARCHER_SIMPLE_COMBAT:
                log = String.format("%s нанёс %s %d урона.", getSimpleName(currentCharacter),
                        getSimpleName(anotherCharacter), ((AbstractArcher) currentCharacter).getSimpleAttackDamage());
                break;
        }
        printLog(log);
    }

    public static void printCurrentStep(int step) {
        log = String.format("Ход %d", step);
        printLog(log);
    }

    public static void printWinner(Squad squad) {
        log = String.format("Победу одержал %s.", getSimpleName(squad));
        printLog(log);
    }
    private static String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public static ArrayList<String> getLogs() {
        return logs;
    }
}
