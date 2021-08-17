package projekt.wsiz;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Logger {

    private PrintWriter writer;

    public void close(){
        this.writer.close();
    }

    public void info(String log) {
        log("INFO", log);
    }

    public void error(String log) {
        log("ERROR", log);
    }

    private void log(String prefix, String log) {
        Date now = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateTimeString = simpleDateFormat.format(now);
        writer.println(dateTimeString + " " + prefix + " " + log);
    }

    public FileLogger(String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName, true);
            this.writer = new PrintWriter(fileStream, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
