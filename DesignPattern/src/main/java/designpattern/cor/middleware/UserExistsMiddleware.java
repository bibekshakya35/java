package designpattern.cor.middleware;

/**
 * @author bibek on 1/20/18
 * @project designpattern
 */
public class UserExistsMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)) {
            return false;
        }
        return checkNext(email, password);
    }
}
