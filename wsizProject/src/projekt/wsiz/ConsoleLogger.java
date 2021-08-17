package projekt.wsiz;

public class ConsoleLogger {

    public void info(String log){
        System.out.println("```\n" + "INFO : " + log + "\n```");
    }

    public void error(String log){
        System.err.println("```\n" + "ERROR : " + log + "\n```");
    }

}
