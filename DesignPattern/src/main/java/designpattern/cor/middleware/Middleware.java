package designpattern.cor.middleware;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 * Base middleware class
 */
public abstract class Middleware {
    private Middleware next;

    /**
     * @param next
     * @return
     * Building a chain of middleware object
     */
    public Middleware linkWith(Middleware next){
        this.next = next;
        return this.next;
    }

    /**
     *
     * @param email email from user
     * @param password password from user
     * @return
     * Subclasses will implement this method
     * with concrete checks
     */
    public abstract boolean check(String email,String password);
    /**
     * Run check on the next object in chain or
     * ends traversing if we're in last object in chain
     */
    protected boolean checkNext(String email,String password){
        if(next==null){
            return true;
        }
        return next.check(email,password);
    }

}
