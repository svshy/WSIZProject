package projekt.wsiz;

public class ConsoleLogger {

    public void info(String log) {
        log("INFO: ", log);
    }

    public void error(String log) {
        log("ERROR: ", log);
    }

    private void log(String prefix, String log) {
        System.out.println(prefix + log);
    }

}
