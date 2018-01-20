package designpattern.cor;

/**
 * @author bibek on 1/15/18
 * @project designpattern
 */
public class ChainOfResponsibility {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args){
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO,"Information");
        logger.logMessage(AbstractLogger.DEBUG," Debug info");
        logger.logMessage(AbstractLogger.ERROR,"Error Message");
    }
}
