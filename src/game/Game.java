package game;

import helpers.FileHelper;
import helpers.SimpleLogger;
import squads.Squads;

/**
 * Created by dmitr on 24.06.2017.
 */
public class Game {

    private Squads squads;
    private boolean isGameOver = false;
    private GameStep alliesStep;
    private GameStep enemyStep;
    private int step = 1;

    public Game() {
        this.squads = new Squads();
        squads.createSquads();
        alliesStep = new GameStep(squads.getAlliesSquad(), squads.getEnemySquad());
        enemyStep = new GameStep(squads.getEnemySquad(), squads.getAlliesSquad());

    }

    public void stratGame() {
        SimpleLogger.printLog("Игра началась");
        while (!isGameOver) {
            SimpleLogger.printCurrentStep(step);
            boolean isAlliesWin = alliesStep.executeStep();
            boolean isEnemyWin = enemyStep.executeStep();
            isGameOver = isAlliesWin || isEnemyWin;
            step++;
        }
        SimpleLogger.printWinner(squads.getAlliesSquad().isSquadDead() ? squads.getEnemySquad()
                : squads.getAlliesSquad());
        SimpleLogger.printLog("Игра завершена");
        FileHelper.saveLogsToFile(SimpleLogger.getLogs());
    }
}
