package projekt.wsiz;

public class MultiLogger implements Logger{

    private Logger[] loggers;

    MultiLogger(Logger[] loggers)
    {
        this.loggers = loggers;
    }

    @Override
    public void info(String log) {

        for (Logger logger:loggers) {
            logger.info(log);
        }

    }

    @Override
    public void error(String log) {
        for (Logger logger:loggers) {
            logger.error(log);
        }
    }
}
