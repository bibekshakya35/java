package designpattern.cor;

/**
 * @author bibek on 1/15/18
 * @project designpattern
 * Chain of responsibility pattern
 * is a design pattern consisting of a source of command objects and
 * a series of processing objects.
 * Each processing object contains logic that defines the type of
 * command object it can handle; the rest are passed to the next processing
 * object in the chain.
 * It's avoid coupling the sender of the request to the receiver
 * Giving more than one object the opportunity to handle the request.
 *
 */
public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG =2;
    public static int ERROR = 3;
    protected int level;

    //next element in the chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write(String message);
}
