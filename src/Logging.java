import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

// Блок обеспечивающий запись действий пользователя в файл log.txt
public class Logging {
    static Date date = new Date();

    public static void logWrite(String action) {

        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("---------------------------------------------------");
            printWriter.println("| " + date + " | " + action + " |");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
