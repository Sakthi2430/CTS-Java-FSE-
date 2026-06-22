class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG : " + message);
    }
}

public class Singletonpattern{
    public static void main(String[] args){
        Logger obj = Logger.getInstance();
        Logger abc = Logger.getInstance();
        if(obj == abc){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }
    }
}