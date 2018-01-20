package designpattern.cor.middleware;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 */
public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * Please, not that checkNext() call can be inserted both
     * in the beginning of this method and in the end
     *
     * This gives much more flexibility than a simple loop over all middleware
     * objects.
     * @param email email from user
     * @param password password from user
     * @return
     */
    @Override
    public boolean check(String email,String password){
        if (System.currentTimeMillis()>currentTime+60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if(request>requestPerMinute){
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email,password);
    }
}
