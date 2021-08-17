package projekt.wsiz;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Logger {

    private PrintWriter writer;
    private boolean logInfo;
    private boolean logError;

    public void close() {
        this.writer.close();
    }

    public void info(String log) {
        if (logInfo)
            log("INFO", log);
    }

    public void error(String log) {
        if (logError)
            log("ERROR", log);
    }

    private void log(String prefix, String log) {
        Date now = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateTimeString = simpleDateFormat.format(now);
        writer.println(dateTimeString + " " + prefix + " " + log);
    }

    public FileLogger(String fileName, boolean logInfo, boolean logError) {
        this.logInfo = logInfo;
        this.logError = logError;
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName, true);
            this.writer = new PrintWriter(fileStream, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
