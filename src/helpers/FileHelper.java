package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by dmitr on 25.06.2017.
 */
public class FileHelper {

    private static final File LOGS_FILE = new File("D:/logs.txt");

    public static void saveLogsToFile(ArrayList<String> logs) {
        if (checkExistsFile()) {
            try (PrintWriter out = new PrintWriter(LOGS_FILE)) {
                for (String log : logs) {
                    out.print(log);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean checkExistsFile() {
        if (!LOGS_FILE.exists()) {
            createLogsFile();
        }
        return true;
    }

    private static void createLogsFile() {
        try {
            LOGS_FILE.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
